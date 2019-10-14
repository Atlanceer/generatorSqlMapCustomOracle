package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CPermitinfo;
import com.zxjk.credit2query.pojo.Crt2CPermitinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CPermitinfoMapper {
    long countByExample(Crt2CPermitinfoExample example);

    int deleteByExample(Crt2CPermitinfoExample example);

    int insert(Crt2CPermitinfo record);

    int insertSelective(Crt2CPermitinfo record);

    List<Crt2CPermitinfo> selectByExample(Crt2CPermitinfoExample example);

    int updateByExampleSelective(@Param("record") Crt2CPermitinfo record, @Param("example") Crt2CPermitinfoExample example);

    int updateByExample(@Param("record") Crt2CPermitinfo record, @Param("example") Crt2CPermitinfoExample example);
}