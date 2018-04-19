package org.spring.springboot.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Token {

    static final String HASH = "%E5%A5%87%E6%80%AA%E7%9A%84%E5%AD%97%E7%AC%A6%E4%B8%B2&pn=30&oq=%E5%A5%87%E6%80%AA%E7%9A%84%E5%AD%97%E7%AC%A6%E4%B8%B2&ie=utf-8&rsv_idx=1&rsv_pq=fd9f2b3c00087951&rsv_t=e7c5NJGVFprZOgQdstCngJa5XGCDpWPaa%2BmgHBpTRSXj1O6T%2Bw%2FGAkVd9hM&rsv";
    static final String CODEONE ="P0ZSeokFCwaFgn33xL7jFq3O7nHED9Tk6593B-FP0D2d6oIUpliHyO6pKfpJImvf7lNCbdYLk1PJk5js3-3q&wd=&eqid=d7d396e3000022b0000000025ad89cd3";
    static final String CODETWO ="kPWPKCj74adLLKhcPE39EBbENFTteKyXHusDHjW85y2CrcS04RjLB-AS0AgTBPr8&wd=&eqid=d7d396e3000022b0000000025ad89cd3";

    /**
     * 编码
     * @param str
     * @return String
     */
    public static String getToken(String str){
        return new sun.misc.BASE64Encoder().encode(str.getBytes()).replace("\n","").replace("\r","");
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

    /**
     * 自定义编码
     * @param email
     * @Param teamId
     * @return String
     */
    public static String getMyToken(String email , String teamid){
        return Token.getToken(Token.getToken(Token.getToken(email
                + new SimpleDateFormat("yyyy-MM-dd").format(new Date())
                + HASH
                + teamid)
                + CODEONE)
                + CODETWO);
    }

    /**
     * 自定义解码
     * @param token
     * @return string
     */
    public static String parseMyToken(String token){
        return Token.ParseToken(Token.ParseToken(Token.ParseToken(token).replace(CODETWO,"")).replace(CODEONE,""));
    }

    public static boolean checkToken(String token , String email , String teamid){
        String Token = parseMyToken(token);
        return parseMyToken(token).equals(email
                + new SimpleDateFormat("yyyy-MM-dd").format(new Date())
                + HASH
                + teamid);
    }



}