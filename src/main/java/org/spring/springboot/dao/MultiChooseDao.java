package org.spring.springboot.dao;

import java.util.List;
import org.spring.springboot.domain.MultiChoose;
import org.spring.springboot.domain.SingleChoose;
import org.springframework.stereotype.Component;

@Component
public interface MultiChooseDao {
    int deleteByPrimaryKey(Integer multichooseid);

    int insert(MultiChoose record);

    int insertSelective(MultiChoose record);

    MultiChoose selectByPrimaryKey(Integer multichooseid);

    int updateByPrimaryKeySelective(MultiChoose record);

    int updateByPrimaryKey(MultiChoose record);

    List<MultiChoose> getMultiChooseListByName(String multiChooseName);
}