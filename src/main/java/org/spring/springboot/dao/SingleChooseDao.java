package org.spring.springboot.dao;
import java.util.List;
import org.springframework.stereotype.Component;
import org.spring.springboot.domain.SingleChoose;

@Component
public interface SingleChooseDao {
    int deleteByPrimaryKey(Integer singlechooseid);

    int insert(SingleChoose record);

    int insertSelective(SingleChoose record);

    SingleChoose selectByPrimaryKey(Integer singlechooseid);

    int updateByPrimaryKeySelective(SingleChoose record);

    int updateByPrimaryKey(SingleChoose record);

    List<SingleChoose> getSingleChooseListByName(String singleChooseName);
}