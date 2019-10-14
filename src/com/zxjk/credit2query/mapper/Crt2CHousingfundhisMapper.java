package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CHousingfundhis;
import com.zxjk.credit2query.pojo.Crt2CHousingfundhisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CHousingfundhisMapper {
    long countByExample(Crt2CHousingfundhisExample example);

    int deleteByExample(Crt2CHousingfundhisExample example);

    int insert(Crt2CHousingfundhis record);

    int insertSelective(Crt2CHousingfundhis record);

    List<Crt2CHousingfundhis> selectByExample(Crt2CHousingfundhisExample example);

    int updateByExampleSelective(@Param("record") Crt2CHousingfundhis record, @Param("example") Crt2CHousingfundhisExample example);

    int updateByExample(@Param("record") Crt2CHousingfundhis record, @Param("example") Crt2CHousingfundhisExample example);
}