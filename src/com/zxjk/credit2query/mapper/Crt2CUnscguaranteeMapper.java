package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CUnscguarantee;
import com.zxjk.credit2query.pojo.Crt2CUnscguaranteeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CUnscguaranteeMapper {
    long countByExample(Crt2CUnscguaranteeExample example);

    int deleteByExample(Crt2CUnscguaranteeExample example);

    int insert(Crt2CUnscguarantee record);

    int insertSelective(Crt2CUnscguarantee record);

    List<Crt2CUnscguarantee> selectByExample(Crt2CUnscguaranteeExample example);

    int updateByExampleSelective(@Param("record") Crt2CUnscguarantee record, @Param("example") Crt2CUnscguaranteeExample example);

    int updateByExample(@Param("record") Crt2CUnscguarantee record, @Param("example") Crt2CUnscguaranteeExample example);
}