package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CReportparsefail;
import com.zxjk.credit2query.pojo.Crt2CReportparsefailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CReportparsefailMapper {
    long countByExample(Crt2CReportparsefailExample example);

    int deleteByExample(Crt2CReportparsefailExample example);

    int insert(Crt2CReportparsefail record);

    int insertSelective(Crt2CReportparsefail record);

    List<Crt2CReportparsefail> selectByExample(Crt2CReportparsefailExample example);

    int updateByExampleSelective(@Param("record") Crt2CReportparsefail record, @Param("example") Crt2CReportparsefailExample example);

    int updateByExample(@Param("record") Crt2CReportparsefail record, @Param("example") Crt2CReportparsefailExample example);
}