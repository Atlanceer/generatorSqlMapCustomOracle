package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CRelasecuredacct;
import com.zxjk.credit2query.pojo.Crt2CRelasecuredacctExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CRelasecuredacctMapper {
    long countByExample(Crt2CRelasecuredacctExample example);

    int deleteByExample(Crt2CRelasecuredacctExample example);

    int insert(Crt2CRelasecuredacct record);

    int insertSelective(Crt2CRelasecuredacct record);

    List<Crt2CRelasecuredacct> selectByExample(Crt2CRelasecuredacctExample example);

    int updateByExampleSelective(@Param("record") Crt2CRelasecuredacct record, @Param("example") Crt2CRelasecuredacctExample example);

    int updateByExample(@Param("record") Crt2CRelasecuredacct record, @Param("example") Crt2CRelasecuredacctExample example);
}