package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CReportmain;
import com.zxjk.credit2query.pojo.Crt2CReportmainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CReportmainMapper {
    long countByExample(Crt2CReportmainExample example);

    int deleteByExample(Crt2CReportmainExample example);

    int insert(Crt2CReportmain record);

    int insertSelective(Crt2CReportmain record);

    List<Crt2CReportmain> selectByExampleWithBLOBs(Crt2CReportmainExample example);

    List<Crt2CReportmain> selectByExample(Crt2CReportmainExample example);

    int updateByExampleSelective(@Param("record") Crt2CReportmain record, @Param("example") Crt2CReportmainExample example);

    int updateByExampleWithBLOBs(@Param("record") Crt2CReportmain record, @Param("example") Crt2CReportmainExample example);

    int updateByExample(@Param("record") Crt2CReportmain record, @Param("example") Crt2CReportmainExample example);
}