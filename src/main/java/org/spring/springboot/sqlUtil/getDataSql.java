package org.spring.springboot.sqlUtil;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class getDataSql {

    private static final String PATH = "F:\\Project\\MyH2O\\2016行政区划数据";
    private static final String OUT = "F:\\Project\\MyH2O\\sql.sql";
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String args[]) {
        StringBuilder sql = new StringBuilder();
        File rootFile = new File(PATH);
        File[] files = rootFile.listFiles();
        int provinceId = 1;
        int prefectureId = 1;
        int countyId = 1;
        int townshipId = 1;
        int villageId = 1;
        for (File file : files) {
            List<Data> datas = new ArrayList<Data>();
            String name = file.getName().replace(".json", "");
            sql.append("insert into province values(" + provinceId + ",'" + name + "', 0);");
            System.out.println("insert into province values(" + provinceId + ",'" + name + "', 0);");
            provinceId++;
            try {
                datas = objectMapper.readValue(readToString(file), new TypeReference<List<Data>>() {
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (Data prefecturedata : datas) {
                sql.append("insert into prefecture values(" + prefectureId + ",'" + prefecturedata.getName() + "'," + (provinceId - 1) + ", 0);");
                System.out.println("insert into prefecture values(" + prefectureId + ",'" + prefecturedata.getName() + "'," + (provinceId - 1) + ", 0);");
                prefectureId++;
                if (prefecturedata.getChildren() != null && prefecturedata.getChildren().size() != 0) {
                    for (Data countydata : prefecturedata.getChildren()) {
                        sql.append("insert into county values(" + (prefectureId - 1) + "," + countyId + ",'" + countydata.getName() + "'," + "0);");
                        System.out.println("insert into county values(" + (prefectureId - 1) + "," + countyId + ",'" + countydata.getName() + "'," + "0);");
                        countyId++;
                        if (countydata.getChildren() != null && countydata.getChildren().size() != 0) {
                            for (Data townshipdata : countydata.getChildren()) {
                                sql.append("insert into township values(" + (countyId - 1) + "," + townshipId + ",'" + townshipdata.getName() + "'," + "0);");
                                System.out.println("insert into township values(" + (countyId - 1) + "," + townshipId + ",'" + townshipdata.getName() + "'," + "0);");
                                townshipId++;
                                if (townshipdata.getChildren() != null && townshipdata.getChildren().size() != 0) {
                                    for (Data villagedata : townshipdata.getChildren()) {
                                        sql.append("insert into village values(" + (townshipId - 1) + "," + villageId + ",'" + villagedata.getName() + "'," + "0);");
                                        System.out.println("insert into village values(" + (townshipId - 1) + "," + villageId + ",'" + villagedata.getName() + "'," + "0);");
                                        villageId++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        writeToFile(sql.toString());
    }


    public static String readToString(File file) {
        String encoding = "UTF-8";
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }

    public static void writeToFile(String sql) {
        try {
            File file = new File(OUT);
            //文件不存在时候，主动穿件文件。
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(sql);
            bw.close();
            fw.close();
            System.out.println("done!");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
