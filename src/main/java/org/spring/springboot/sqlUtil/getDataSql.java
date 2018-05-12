package org.spring.springboot.sqlUtil;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class getDataSql {

    private static final String PATH = "J:\\2016行政区划数据";
    private static final String OUT = "J:\\sql.txt";
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String args[]) {
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
            writeToFile("insert into province values(" + provinceId + ",'" + name + "','');");
            System.out.println("insert into province values(" + provinceId + ",'" + name + "','');");
            provinceId++;
            try {
                datas = objectMapper.readValue(readToString(file), new TypeReference<List<Data>>() {
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (Data prefecturedata : datas) {
                writeToFile("insert into prefecture values(" + prefectureId + ",'" + prefecturedata.getName() + "'," + provinceId + ",'');");
                System.out.println("insert into prefecture values(" + prefectureId + ",'" + prefecturedata.getName() + "'," + provinceId + ",'');");
                prefectureId++;
                if (prefecturedata.getChildren() != null && prefecturedata.getChildren().size() != 0) {
                    for (Data countydata : prefecturedata.getChildren()) {
                        writeToFile("insert into county values(" + prefectureId + "," + countyId + ",'" + countydata.getName() + "',"+ "'');");
                        System.out.println("insert into county values(" + prefectureId + "," + countyId + ",'" + countydata.getName() + "',"+ "'');");
                        countyId++;
                        if (countydata.getChildren() != null && countydata.getChildren().size() != 0) {
                            for (Data townshipdata : countydata.getChildren()) {
                                writeToFile("insert into township values(" + countyId + "," + townshipId + ",'" + townshipdata.getName() + "',"+ "'');");
                                System.out.println("insert into township values(" + countyId + "," + townshipId + ",'" + townshipdata.getName() + "',"+ "'');");
                                townshipId++;
                                if (townshipdata.getChildren() != null && townshipdata.getChildren().size() != 0) {
                                    for (Data villagedata : townshipdata.getChildren()) {
                                        writeToFile("insert into village values(" + townshipId + "," + villageId + ",'" + villagedata.getName() + "',"+ "'');");
                                        System.out.println("insert into village values(" + townshipId + "," + villageId + ",'" + villagedata.getName() + "',"+ "'');");
                                        villageId++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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
    public static void writeToFile(String sql){
        try {
            File file = new File(OUT);
            //文件不存在时候，主动穿件文件。
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(sql);
            bw.close(); fw.close();
            System.out.println("done!");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
