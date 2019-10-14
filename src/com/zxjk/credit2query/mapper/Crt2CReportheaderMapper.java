package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CReportheader;
import com.zxjk.credit2query.pojo.Crt2CReportheaderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CReportheaderMapper {
    long countByExample(Crt2CReportheaderExample example);

    int deleteByExample(Crt2CReportheaderExample example);

    int insert(Crt2CReportheader record);

    int insertSelective(Crt2CReportheader record);

    List<Crt2CReportheader> selectByExample(Crt2CReportheaderExample example);

    int updateByExampleSelective(@Param("record") Crt2CReportheader record, @Param("example") Crt2CReportheaderExample example);

    int updateByExample(@Param("record") Crt2CReportheader record, @Param("example") Crt2CReportheaderExample example);
}