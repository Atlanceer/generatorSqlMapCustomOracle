package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CFinancing;
import com.zxjk.credit2query.pojo.Crt2CFinancingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CFinancingMapper {
    long countByExample(Crt2CFinancingExample example);

    int deleteByExample(Crt2CFinancingExample example);

    int insert(Crt2CFinancing record);

    int insertSelective(Crt2CFinancing record);

    List<Crt2CFinancing> selectByExample(Crt2CFinancingExample example);

    int updateByExampleSelective(@Param("record") Crt2CFinancing record, @Param("example") Crt2CFinancingExample example);

    int updateByExample(@Param("record") Crt2CFinancing record, @Param("example") Crt2CFinancingExample example);
}