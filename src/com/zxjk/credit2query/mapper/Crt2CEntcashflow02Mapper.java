package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CEntcashflow02;
import com.zxjk.credit2query.pojo.Crt2CEntcashflow02Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CEntcashflow02Mapper {
    long countByExample(Crt2CEntcashflow02Example example);

    int deleteByExample(Crt2CEntcashflow02Example example);

    int insert(Crt2CEntcashflow02 record);

    int insertSelective(Crt2CEntcashflow02 record);

    List<Crt2CEntcashflow02> selectByExample(Crt2CEntcashflow02Example example);

    int updateByExampleSelective(@Param("record") Crt2CEntcashflow02 record, @Param("example") Crt2CEntcashflow02Example example);

    int updateByExample(@Param("record") Crt2CEntcashflow02 record, @Param("example") Crt2CEntcashflow02Example example);
}