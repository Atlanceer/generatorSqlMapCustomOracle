package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CHigherauthority;
import com.zxjk.credit2query.pojo.Crt2CHigherauthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CHigherauthorityMapper {
    long countByExample(Crt2CHigherauthorityExample example);

    int deleteByExample(Crt2CHigherauthorityExample example);

    int insert(Crt2CHigherauthority record);

    int insertSelective(Crt2CHigherauthority record);

    List<Crt2CHigherauthority> selectByExample(Crt2CHigherauthorityExample example);

    int updateByExampleSelective(@Param("record") Crt2CHigherauthority record, @Param("example") Crt2CHigherauthorityExample example);

    int updateByExample(@Param("record") Crt2CHigherauthority record, @Param("example") Crt2CHigherauthorityExample example);
}