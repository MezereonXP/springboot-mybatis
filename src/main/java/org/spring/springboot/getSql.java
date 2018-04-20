package org.spring.springboot;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class getSql {

    private static final String PATH = "G:\\";

    public static void main(String args[]){
        Integer i = 1;
        File rootFile = new File(PATH);
        File[] files = rootFile.listFiles();
        Map<Integer ,String> baseids = new HashMap<Integer,String>();
        for(File file : files){
            if(i > 0){
                i -- ;
                continue;
            }
            String fileName = file.getName();
            String[] nums = fileName.split("_");
            Integer baseid = Integer.parseInt(nums[2]);
            baseids.put(baseid,"http://static.myh2o.org.cn/pic/" + file.getName());
        }
        for(Map.Entry<Integer,String> entry : baseids.entrySet()){
            System.out.println("update sample set picture = '" + entry.getValue() + "'" + " where baseid = " + entry.getKey() + ";");
        }
    }

}
