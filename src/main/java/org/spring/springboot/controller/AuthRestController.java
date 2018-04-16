package org.spring.springboot.controller;

import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.spring.springboot.domain.Blog;
import org.spring.springboot.domain.Sample;
import org.spring.springboot.response.Response;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AuthRestController {

    private static final String AK = "8X6zwKXI4QlDgT0BXRBqZiS7ve12z9Z2GraDlQ0l";
    private static final String SK = "9_4YPbY6AiqBc2iuvwy6WF-gacmpLePGMkExCtTR";

    /**
     * 获得上传的签名
     *
     * @return
     */
    @RequestMapping(value = "/api/getSign", method = RequestMethod.GET)
    public Response getSign() {
        Response response = new Response();
        try {
            response.setStatus(true);
            Auth auth = Auth.create(AK, SK);
            Map<String, String> result = new HashMap<String, String>();
            StringMap stringMap = new StringMap();
            stringMap.put("keyPrefix", "uploads");
            result.put("token", auth.uploadToken("myh2o", null, 3600L, stringMap));
            response.setData(result);
            return response;
        } catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
