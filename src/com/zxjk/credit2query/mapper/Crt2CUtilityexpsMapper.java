package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CUtilityexps;
import com.zxjk.credit2query.pojo.Crt2CUtilityexpsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CUtilityexpsMapper {
    long countByExample(Crt2CUtilityexpsExample example);

    int deleteByExample(Crt2CUtilityexpsExample example);

    int insert(Crt2CUtilityexps record);

    int insertSelective(Crt2CUtilityexps record);

    List<Crt2CUtilityexps> selectByExample(Crt2CUtilityexpsExample example);

    int updateByExampleSelective(@Param("record") Crt2CUtilityexps record, @Param("example") Crt2CUtilityexpsExample example);

    int updateByExample(@Param("record") Crt2CUtilityexps record, @Param("example") Crt2CUtilityexpsExample example);
}