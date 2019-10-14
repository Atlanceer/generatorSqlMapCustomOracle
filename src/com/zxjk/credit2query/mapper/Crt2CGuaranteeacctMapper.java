package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CGuaranteeacct;
import com.zxjk.credit2query.pojo.Crt2CGuaranteeacctExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CGuaranteeacctMapper {
    long countByExample(Crt2CGuaranteeacctExample example);

    int deleteByExample(Crt2CGuaranteeacctExample example);

    int insert(Crt2CGuaranteeacct record);

    int insertSelective(Crt2CGuaranteeacct record);

    List<Crt2CGuaranteeacct> selectByExample(Crt2CGuaranteeacctExample example);

    int updateByExampleSelective(@Param("record") Crt2CGuaranteeacct record, @Param("example") Crt2CGuaranteeacctExample example);

    int updateByExample(@Param("record") Crt2CGuaranteeacct record, @Param("example") Crt2CGuaranteeacctExample example);
}