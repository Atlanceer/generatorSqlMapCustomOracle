package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CEntblsheet07;
import com.zxjk.credit2query.pojo.Crt2CEntblsheet07Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CEntblsheet07Mapper {
    long countByExample(Crt2CEntblsheet07Example example);

    int deleteByExample(Crt2CEntblsheet07Example example);

    int insert(Crt2CEntblsheet07 record);

    int insertSelective(Crt2CEntblsheet07 record);

    List<Crt2CEntblsheet07> selectByExample(Crt2CEntblsheet07Example example);

    int updateByExampleSelective(@Param("record") Crt2CEntblsheet07 record, @Param("example") Crt2CEntblsheet07Example example);

    int updateByExample(@Param("record") Crt2CEntblsheet07 record, @Param("example") Crt2CEntblsheet07Example example);
}