package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CEntblsheet02;
import com.zxjk.credit2query.pojo.Crt2CEntblsheet02Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CEntblsheet02Mapper {
    long countByExample(Crt2CEntblsheet02Example example);

    int deleteByExample(Crt2CEntblsheet02Example example);

    int insert(Crt2CEntblsheet02 record);

    int insertSelective(Crt2CEntblsheet02 record);

    List<Crt2CEntblsheet02> selectByExample(Crt2CEntblsheet02Example example);

    int updateByExampleSelective(@Param("record") Crt2CEntblsheet02 record, @Param("example") Crt2CEntblsheet02Example example);

    int updateByExample(@Param("record") Crt2CEntblsheet02 record, @Param("example") Crt2CEntblsheet02Example example);
}