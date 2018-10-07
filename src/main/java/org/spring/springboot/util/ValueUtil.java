package org.spring.springboot.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: ValueUtil
 * @description: The util to controll value
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/10/7
 **/
public class ValueUtil {
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
}
