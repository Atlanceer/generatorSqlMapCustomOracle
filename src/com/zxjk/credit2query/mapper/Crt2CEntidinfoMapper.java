package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CEntidinfo;
import com.zxjk.credit2query.pojo.Crt2CEntidinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CEntidinfoMapper {
    long countByExample(Crt2CEntidinfoExample example);

    int deleteByExample(Crt2CEntidinfoExample example);

    int insert(Crt2CEntidinfo record);

    int insertSelective(Crt2CEntidinfo record);

    List<Crt2CEntidinfo> selectByExample(Crt2CEntidinfoExample example);

    int updateByExampleSelective(@Param("record") Crt2CEntidinfo record, @Param("example") Crt2CEntidinfoExample example);

    int updateByExample(@Param("record") Crt2CEntidinfo record, @Param("example") Crt2CEntidinfoExample example);
}