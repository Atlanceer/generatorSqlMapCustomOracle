package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CQuarantine;
import com.zxjk.credit2query.pojo.Crt2CQuarantineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CQuarantineMapper {
    long countByExample(Crt2CQuarantineExample example);

    int deleteByExample(Crt2CQuarantineExample example);

    int insert(Crt2CQuarantine record);

    int insertSelective(Crt2CQuarantine record);

    List<Crt2CQuarantine> selectByExample(Crt2CQuarantineExample example);

    int updateByExampleSelective(@Param("record") Crt2CQuarantine record, @Param("example") Crt2CQuarantineExample example);

    int updateByExample(@Param("record") Crt2CQuarantine record, @Param("example") Crt2CQuarantineExample example);
}