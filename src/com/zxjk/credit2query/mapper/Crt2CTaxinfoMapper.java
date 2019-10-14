package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CTaxinfo;
import com.zxjk.credit2query.pojo.Crt2CTaxinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CTaxinfoMapper {
    long countByExample(Crt2CTaxinfoExample example);

    int deleteByExample(Crt2CTaxinfoExample example);

    int insert(Crt2CTaxinfo record);

    int insertSelective(Crt2CTaxinfo record);

    List<Crt2CTaxinfo> selectByExample(Crt2CTaxinfoExample example);

    int updateByExampleSelective(@Param("record") Crt2CTaxinfo record, @Param("example") Crt2CTaxinfoExample example);

    int updateByExample(@Param("record") Crt2CTaxinfo record, @Param("example") Crt2CTaxinfoExample example);
}