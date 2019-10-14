package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CSupervision;
import com.zxjk.credit2query.pojo.Crt2CSupervisionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CSupervisionMapper {
    long countByExample(Crt2CSupervisionExample example);

    int deleteByExample(Crt2CSupervisionExample example);

    int insert(Crt2CSupervision record);

    int insertSelective(Crt2CSupervision record);

    List<Crt2CSupervision> selectByExample(Crt2CSupervisionExample example);

    int updateByExampleSelective(@Param("record") Crt2CSupervision record, @Param("example") Crt2CSupervisionExample example);

    int updateByExample(@Param("record") Crt2CSupervision record, @Param("example") Crt2CSupervisionExample example);
}