package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CUtilityexpshis;
import com.zxjk.credit2query.pojo.Crt2CUtilityexpshisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CUtilityexpshisMapper {
    long countByExample(Crt2CUtilityexpshisExample example);

    int deleteByExample(Crt2CUtilityexpshisExample example);

    int insert(Crt2CUtilityexpshis record);

    int insertSelective(Crt2CUtilityexpshis record);

    List<Crt2CUtilityexpshis> selectByExample(Crt2CUtilityexpshisExample example);

    int updateByExampleSelective(@Param("record") Crt2CUtilityexpshis record, @Param("example") Crt2CUtilityexpshisExample example);

    int updateByExample(@Param("record") Crt2CUtilityexpshis record, @Param("example") Crt2CUtilityexpshisExample example);
}