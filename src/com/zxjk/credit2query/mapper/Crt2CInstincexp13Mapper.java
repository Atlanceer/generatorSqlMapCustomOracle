package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CInstincexp13;
import com.zxjk.credit2query.pojo.Crt2CInstincexp13Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CInstincexp13Mapper {
    long countByExample(Crt2CInstincexp13Example example);

    int deleteByExample(Crt2CInstincexp13Example example);

    int insert(Crt2CInstincexp13 record);

    int insertSelective(Crt2CInstincexp13 record);

    List<Crt2CInstincexp13> selectByExample(Crt2CInstincexp13Example example);

    int updateByExampleSelective(@Param("record") Crt2CInstincexp13 record, @Param("example") Crt2CInstincexp13Example example);

    int updateByExample(@Param("record") Crt2CInstincexp13 record, @Param("example") Crt2CInstincexp13Example example);
}