package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CStatement;
import com.zxjk.credit2query.pojo.Crt2CStatementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CStatementMapper {
    long countByExample(Crt2CStatementExample example);

    int deleteByExample(Crt2CStatementExample example);

    int insert(Crt2CStatement record);

    int insertSelective(Crt2CStatement record);

    List<Crt2CStatement> selectByExample(Crt2CStatementExample example);

    int updateByExampleSelective(@Param("record") Crt2CStatement record, @Param("example") Crt2CStatementExample example);

    int updateByExample(@Param("record") Crt2CStatement record, @Param("example") Crt2CStatementExample example);
}