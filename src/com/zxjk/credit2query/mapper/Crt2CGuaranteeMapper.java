package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CGuarantee;
import com.zxjk.credit2query.pojo.Crt2CGuaranteeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CGuaranteeMapper {
    long countByExample(Crt2CGuaranteeExample example);

    int deleteByExample(Crt2CGuaranteeExample example);

    int insert(Crt2CGuarantee record);

    int insertSelective(Crt2CGuarantee record);

    List<Crt2CGuarantee> selectByExample(Crt2CGuaranteeExample example);

    int updateByExampleSelective(@Param("record") Crt2CGuarantee record, @Param("example") Crt2CGuaranteeExample example);

    int updateByExample(@Param("record") Crt2CGuarantee record, @Param("example") Crt2CGuaranteeExample example);
}