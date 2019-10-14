package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CLoanoutstanding;
import com.zxjk.credit2query.pojo.Crt2CLoanoutstandingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CLoanoutstandingMapper {
    long countByExample(Crt2CLoanoutstandingExample example);

    int deleteByExample(Crt2CLoanoutstandingExample example);

    int insert(Crt2CLoanoutstanding record);

    int insertSelective(Crt2CLoanoutstanding record);

    List<Crt2CLoanoutstanding> selectByExample(Crt2CLoanoutstandingExample example);

    int updateByExampleSelective(@Param("record") Crt2CLoanoutstanding record, @Param("example") Crt2CLoanoutstandingExample example);

    int updateByExample(@Param("record") Crt2CLoanoutstanding record, @Param("example") Crt2CLoanoutstandingExample example);
}