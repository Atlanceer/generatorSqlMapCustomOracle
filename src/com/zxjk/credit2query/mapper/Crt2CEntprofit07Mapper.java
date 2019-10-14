package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CEntprofit07;
import com.zxjk.credit2query.pojo.Crt2CEntprofit07Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CEntprofit07Mapper {
    long countByExample(Crt2CEntprofit07Example example);

    int deleteByExample(Crt2CEntprofit07Example example);

    int insert(Crt2CEntprofit07 record);

    int insertSelective(Crt2CEntprofit07 record);

    List<Crt2CEntprofit07> selectByExample(Crt2CEntprofit07Example example);

    int updateByExampleSelective(@Param("record") Crt2CEntprofit07 record, @Param("example") Crt2CEntprofit07Example example);

    int updateByExample(@Param("record") Crt2CEntprofit07 record, @Param("example") Crt2CEntprofit07Example example);
}