package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CDebitinterest;
import com.zxjk.credit2query.pojo.Crt2CDebitinterestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CDebitinterestMapper {
    long countByExample(Crt2CDebitinterestExample example);

    int deleteByExample(Crt2CDebitinterestExample example);

    int insert(Crt2CDebitinterest record);

    int insertSelective(Crt2CDebitinterest record);

    List<Crt2CDebitinterest> selectByExample(Crt2CDebitinterestExample example);

    int updateByExampleSelective(@Param("record") Crt2CDebitinterest record, @Param("example") Crt2CDebitinterestExample example);

    int updateByExample(@Param("record") Crt2CDebitinterest record, @Param("example") Crt2CDebitinterestExample example);
}