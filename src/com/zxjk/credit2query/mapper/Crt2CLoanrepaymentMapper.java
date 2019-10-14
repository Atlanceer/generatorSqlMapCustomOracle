package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CLoanrepayment;
import com.zxjk.credit2query.pojo.Crt2CLoanrepaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CLoanrepaymentMapper {
    long countByExample(Crt2CLoanrepaymentExample example);

    int deleteByExample(Crt2CLoanrepaymentExample example);

    int insert(Crt2CLoanrepayment record);

    int insertSelective(Crt2CLoanrepayment record);

    List<Crt2CLoanrepayment> selectByExample(Crt2CLoanrepaymentExample example);

    int updateByExampleSelective(@Param("record") Crt2CLoanrepayment record, @Param("example") Crt2CLoanrepaymentExample example);

    int updateByExample(@Param("record") Crt2CLoanrepayment record, @Param("example") Crt2CLoanrepaymentExample example);
}