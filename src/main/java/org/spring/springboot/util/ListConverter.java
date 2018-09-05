package org.spring.springboot.util;/**
 * Created by Administrator on 2018/5/14.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.spring.springboot.domain.MultiChoose;
import org.spring.springboot.domain.SingleChoose;

/**
 * @program: ListConverter
 * @description: To convert List to Map
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/5/14
 **/
public class ListConverter {

  public static Map<Integer, String> convertSingleChooseList(List<SingleChoose> singleChooseList){
    Map<Integer, String> map = new HashMap<Integer, String>();
    for (SingleChoose singleChoose:singleChooseList){
      map.put(singleChoose.getSinglechooseid(), singleChoose.getSinglechoosevalue());
    }
    return map;
  }

  public static Map<Integer, String> convertMultiChooseList(List<MultiChoose> multiChooseList){
    Map<Integer, String> map = new HashMap<Integer, String>();
    for (MultiChoose multiChoose:multiChooseList){
      map.put(multiChoose.getMultichooseid(), multiChoose.getMultichoosevalue());
    }
    return map;
  }

}
