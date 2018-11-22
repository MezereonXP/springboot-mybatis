package org.spring.springboot.util;

import org.spring.springboot.dao.CleanSample;
import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.domain.Sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: ValueUtil
 * @description: The util to controll value
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/10/7
 **/
public class ValueUtil {
    public static final int WATERTYPE_FLAG = 1;
    public static final int DRINKINGWATER_FLAG = 2;
    public static final int WATERSOURCE_FLAG = 3;
    public static final int DELIVERYMETHOD_FLAG = 4;
    public static final int CENTRALIZEDWATERMETHOD_FLAG = 5;
    public static final int WATERSTORAGE_FLAG = 6;
    public static final int TREATMENTMETHOD_FLAG = 7;
    public static final int POTENTIAL_FLAG = 8;
    public static final int SMELL_FLAG = 9;
    public static final int VISUAL_FLAG = 10;
    public static final int SANITARYTYPE_FLAG = 11;
    public static final int LOCATION_FLAG = 12;
    public static Map<String, String> getMap() {
        String fileName = "C:\\Users\\Administrator\\Desktop\\data.txt";
        File file = new File(fileName);
        BufferedReader reader = null;
        Map<String, String> result = new HashMap<>();
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "gbk"));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                String[] s = tempString.split("\t");
                result.put(s[1], s[0]);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return result;
    }

    public static List<CleanSample> toCleanSampleList(List<Sample> samplesByCycleTeamid, LocationDao locationDao) {
        List<CleanSample> list = new ArrayList<>();
        for (Sample sample : samplesByCycleTeamid) {
            list.add(new CleanSample(sample, locationDao.selectByPrimaryKey(sample.getLocationId())));
        }
        return list;
    }
}
