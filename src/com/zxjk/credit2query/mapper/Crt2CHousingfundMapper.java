package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CHousingfund;
import com.zxjk.credit2query.pojo.Crt2CHousingfundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CHousingfundMapper {
    long countByExample(Crt2CHousingfundExample example);

    int deleteByExample(Crt2CHousingfundExample example);

    int insert(Crt2CHousingfund record);

    int insertSelective(Crt2CHousingfund record);

    List<Crt2CHousingfund> selectByExample(Crt2CHousingfundExample example);

    int updateByExampleSelective(@Param("record") Crt2CHousingfund record, @Param("example") Crt2CHousingfundExample example);

    int updateByExample(@Param("record") Crt2CHousingfund record, @Param("example") Crt2CHousingfundExample example);
}