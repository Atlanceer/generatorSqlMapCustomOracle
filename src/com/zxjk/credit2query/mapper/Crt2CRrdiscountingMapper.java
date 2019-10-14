package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CRrdiscounting;
import com.zxjk.credit2query.pojo.Crt2CRrdiscountingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CRrdiscountingMapper {
    long countByExample(Crt2CRrdiscountingExample example);

    int deleteByExample(Crt2CRrdiscountingExample example);

    int insert(Crt2CRrdiscounting record);

    int insertSelective(Crt2CRrdiscounting record);

    List<Crt2CRrdiscounting> selectByExample(Crt2CRrdiscountingExample example);

    int updateByExampleSelective(@Param("record") Crt2CRrdiscounting record, @Param("example") Crt2CRrdiscountingExample example);

    int updateByExample(@Param("record") Crt2CRrdiscounting record, @Param("example") Crt2CRrdiscountingExample example);
}