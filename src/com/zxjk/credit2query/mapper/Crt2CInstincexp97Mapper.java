package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CInstincexp97;
import com.zxjk.credit2query.pojo.Crt2CInstincexp97Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CInstincexp97Mapper {
    long countByExample(Crt2CInstincexp97Example example);

    int deleteByExample(Crt2CInstincexp97Example example);

    int insert(Crt2CInstincexp97 record);

    int insertSelective(Crt2CInstincexp97 record);

    List<Crt2CInstincexp97> selectByExample(Crt2CInstincexp97Example example);

    int updateByExampleSelective(@Param("record") Crt2CInstincexp97 record, @Param("example") Crt2CInstincexp97Example example);

    int updateByExample(@Param("record") Crt2CInstincexp97 record, @Param("example") Crt2CInstincexp97Example example);
}