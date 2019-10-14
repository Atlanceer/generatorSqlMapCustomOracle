package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CRraccount;
import com.zxjk.credit2query.pojo.Crt2CRraccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CRraccountMapper {
    long countByExample(Crt2CRraccountExample example);

    int deleteByExample(Crt2CRraccountExample example);

    int insert(Crt2CRraccount record);

    int insertSelective(Crt2CRraccount record);

    List<Crt2CRraccount> selectByExample(Crt2CRraccountExample example);

    int updateByExampleSelective(@Param("record") Crt2CRraccount record, @Param("example") Crt2CRraccountExample example);

    int updateByExample(@Param("record") Crt2CRraccount record, @Param("example") Crt2CRraccountExample example);
}