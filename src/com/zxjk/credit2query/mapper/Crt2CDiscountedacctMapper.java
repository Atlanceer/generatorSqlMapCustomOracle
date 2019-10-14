package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CDiscountedacct;
import com.zxjk.credit2query.pojo.Crt2CDiscountedacctExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CDiscountedacctMapper {
    long countByExample(Crt2CDiscountedacctExample example);

    int deleteByExample(Crt2CDiscountedacctExample example);

    int insert(Crt2CDiscountedacct record);

    int insertSelective(Crt2CDiscountedacct record);

    List<Crt2CDiscountedacct> selectByExample(Crt2CDiscountedacctExample example);

    int updateByExampleSelective(@Param("record") Crt2CDiscountedacct record, @Param("example") Crt2CDiscountedacctExample example);

    int updateByExample(@Param("record") Crt2CDiscountedacct record, @Param("example") Crt2CDiscountedacctExample example);
}