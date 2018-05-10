package org.spring.springboot.controller;/**
 * Created by Administrator on 2018/5/10.
 */

import java.util.List;
import org.spring.springboot.dao.MultiChooseDao;
import org.spring.springboot.dao.SingleChooseDao;
import org.spring.springboot.domain.MultiChoose;
import org.spring.springboot.domain.SampleWithBLOBs;
import org.spring.springboot.domain.SingleChoose;
import org.spring.springboot.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SingleChooseController
 * @description: The controller of single choose
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/5/10
 **/
@RestController
public class ChooseController {

  @Autowired
  private SingleChooseDao singleChooseDao;

  @Autowired
  private MultiChooseDao multiChooseDao;


  @RequestMapping(value = "/api/getSingleChooseByName", method = RequestMethod.GET)
  public Response getSingleChooseByName(@RequestParam(value = "name", required = true) String name) {
      Response response = new Response();
      try {
        List<SingleChoose> list = singleChooseDao.getSingleChooseListByName(name);
        response.setStatus(list != null);
        response.setData(list);
        return response;
      } catch (Exception e) {
        response.setMsg(e.getMessage());
        response.setStatus(false);
        return response;
      }
  }

  @RequestMapping(value = "/api/getMultiChooseByName", method = RequestMethod.GET)
  public Response getMultiChooseByName(@RequestParam(value = "name", required = true) String name) {
    Response response = new Response();
    try {
      List<MultiChoose> list = multiChooseDao.getMultiChooseListByName(name);
      response.setStatus(list != null);
      response.setData(list);
      return response;
    } catch (Exception e) {
      response.setMsg(e.getMessage());
      response.setStatus(false);
      return response;
    }
  }
}
