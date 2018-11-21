package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.DeliveryMethod;
import org.spring.springboot.domain.DeliveryMethodExample;
import org.springframework.stereotype.Component;

@Component
public interface DeliveryMethodMapper {
    long countByExample(DeliveryMethodExample example);

    int deleteByExample(DeliveryMethodExample example);

    int deleteByPrimaryKey(Integer deliveryMethodId);

    int insert(DeliveryMethod record);

    int insertSelective(DeliveryMethod record);

    List<DeliveryMethod> selectByExample(DeliveryMethodExample example);

    DeliveryMethod selectByPrimaryKey(Integer deliveryMethodId);

    int updateByExampleSelective(@Param("record") DeliveryMethod record, @Param("example") DeliveryMethodExample example);

    int updateByExample(@Param("record") DeliveryMethod record, @Param("example") DeliveryMethodExample example);

    int updateByPrimaryKeySelective(DeliveryMethod record);

    int updateByPrimaryKey(DeliveryMethod record);
}