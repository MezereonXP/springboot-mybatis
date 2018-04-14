package org.spring.springboot.util;

import java.io.IOException;

public class Token {

    /**
     * 编码
     * @param str
     * @return String
     */
    public static String getToken(String str){
        return new sun.misc.BASE64Encoder().encode(str.getBytes());
    }

    /**
     * 解码
     * @param str
     * @return string
     */
    public static String ParseToken(String str){
        byte[] bt = null;
        try {
            sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
            bt = decoder.decodeBuffer( str );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(bt);
    }

}