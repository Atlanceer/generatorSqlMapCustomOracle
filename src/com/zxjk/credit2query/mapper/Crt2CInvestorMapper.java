package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CInvestor;
import com.zxjk.credit2query.pojo.Crt2CInvestorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CInvestorMapper {
    long countByExample(Crt2CInvestorExample example);

    int deleteByExample(Crt2CInvestorExample example);

    int insert(Crt2CInvestor record);

    int insertSelective(Crt2CInvestor record);

    List<Crt2CInvestor> selectByExample(Crt2CInvestorExample example);

    int updateByExampleSelective(@Param("record") Crt2CInvestor record, @Param("example") Crt2CInvestorExample example);

    int updateByExample(@Param("record") Crt2CInvestor record, @Param("example") Crt2CInvestorExample example);
}