package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CEntcashflow07;
import com.zxjk.credit2query.pojo.Crt2CEntcashflow07Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CEntcashflow07Mapper {
    long countByExample(Crt2CEntcashflow07Example example);

    int deleteByExample(Crt2CEntcashflow07Example example);

    int insert(Crt2CEntcashflow07 record);

    int insertSelective(Crt2CEntcashflow07 record);

    List<Crt2CEntcashflow07> selectByExample(Crt2CEntcashflow07Example example);

    int updateByExampleSelective(@Param("record") Crt2CEntcashflow07 record, @Param("example") Crt2CEntcashflow07Example example);

    int updateByExample(@Param("record") Crt2CEntcashflow07 record, @Param("example") Crt2CEntcashflow07Example example);
}