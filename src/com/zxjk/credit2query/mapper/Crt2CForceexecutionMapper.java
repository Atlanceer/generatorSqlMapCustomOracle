package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CForceexecution;
import com.zxjk.credit2query.pojo.Crt2CForceexecutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CForceexecutionMapper {
    long countByExample(Crt2CForceexecutionExample example);

    int deleteByExample(Crt2CForceexecutionExample example);

    int insert(Crt2CForceexecution record);

    int insertSelective(Crt2CForceexecution record);

    List<Crt2CForceexecution> selectByExample(Crt2CForceexecutionExample example);

    int updateByExampleSelective(@Param("record") Crt2CForceexecution record, @Param("example") Crt2CForceexecutionExample example);

    int updateByExample(@Param("record") Crt2CForceexecution record, @Param("example") Crt2CForceexecutionExample example);
}