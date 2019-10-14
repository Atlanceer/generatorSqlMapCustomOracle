package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CExemption;
import com.zxjk.credit2query.pojo.Crt2CExemptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CExemptionMapper {
    long countByExample(Crt2CExemptionExample example);

    int deleteByExample(Crt2CExemptionExample example);

    int insert(Crt2CExemption record);

    int insertSelective(Crt2CExemption record);

    List<Crt2CExemption> selectByExample(Crt2CExemptionExample example);

    int updateByExampleSelective(@Param("record") Crt2CExemption record, @Param("example") Crt2CExemptionExample example);

    int updateByExample(@Param("record") Crt2CExemption record, @Param("example") Crt2CExemptionExample example);
}