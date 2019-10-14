package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CBasicprofile;
import com.zxjk.credit2query.pojo.Crt2CBasicprofileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CBasicprofileMapper {
    long countByExample(Crt2CBasicprofileExample example);

    int deleteByExample(Crt2CBasicprofileExample example);

    int insert(Crt2CBasicprofile record);

    int insertSelective(Crt2CBasicprofile record);

    List<Crt2CBasicprofile> selectByExample(Crt2CBasicprofileExample example);

    int updateByExampleSelective(@Param("record") Crt2CBasicprofile record, @Param("example") Crt2CBasicprofileExample example);

    int updateByExample(@Param("record") Crt2CBasicprofile record, @Param("example") Crt2CBasicprofileExample example);
}