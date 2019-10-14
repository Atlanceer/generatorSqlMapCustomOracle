package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CInstblesheet13;
import com.zxjk.credit2query.pojo.Crt2CInstblesheet13Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CInstblesheet13Mapper {
    long countByExample(Crt2CInstblesheet13Example example);

    int deleteByExample(Crt2CInstblesheet13Example example);

    int insert(Crt2CInstblesheet13 record);

    int insertSelective(Crt2CInstblesheet13 record);

    List<Crt2CInstblesheet13> selectByExample(Crt2CInstblesheet13Example example);

    int updateByExampleSelective(@Param("record") Crt2CInstblesheet13 record, @Param("example") Crt2CInstblesheet13Example example);

    int updateByExample(@Param("record") Crt2CInstblesheet13 record, @Param("example") Crt2CInstblesheet13Example example);
}