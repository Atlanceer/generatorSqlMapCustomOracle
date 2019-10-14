package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CEntprofit02;
import com.zxjk.credit2query.pojo.Crt2CEntprofit02Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CEntprofit02Mapper {
    long countByExample(Crt2CEntprofit02Example example);

    int deleteByExample(Crt2CEntprofit02Example example);

    int insert(Crt2CEntprofit02 record);

    int insertSelective(Crt2CEntprofit02 record);

    List<Crt2CEntprofit02> selectByExample(Crt2CEntprofit02Example example);

    int updateByExampleSelective(@Param("record") Crt2CEntprofit02 record, @Param("example") Crt2CEntprofit02Example example);

    int updateByExample(@Param("record") Crt2CEntprofit02 record, @Param("example") Crt2CEntprofit02Example example);
}