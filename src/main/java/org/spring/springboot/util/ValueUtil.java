package org.spring.springboot.util;

import org.spring.springboot.dao.CleanSample;
import org.spring.springboot.dao.HistoryMapper;
import org.spring.springboot.dao.LocationDao;
import org.spring.springboot.domain.History;
import org.spring.springboot.domain.Sample;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.*;

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

    public static final int CREATE_FLAG = 1001;
    public static final int UPDATE_FLAG = 1002;
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

    /**
     * @Description: 获取客户端IP地址
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            if (ip.equals("127.0.0.1")) {
                //根据网卡取本机配置的IP
                InetAddress inet = null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ip = inet.getHostAddress();
            }
        }
        // 多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if (ip != null && ip.length() > 15) {
            if (ip.indexOf(",") > 0) {
                ip = ip.substring(0, ip.indexOf(","));
            }
        }
        return ip;
    }

    public static void setHistory(HistoryMapper historyMapper, Sample sample, HttpServletRequest req, Integer flag) {
        History history = new History();
        history.setDate(new Date());
        history.setSampleId(sample.getBaseId());
        history.setStatus(flag);
        history.setIpAddress(ValueUtil.getIpAddr(req));
        historyMapper.insert(history);
    }

}
