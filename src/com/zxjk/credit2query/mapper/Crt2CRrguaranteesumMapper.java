package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CRrguaranteesum;
import com.zxjk.credit2query.pojo.Crt2CRrguaranteesumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CRrguaranteesumMapper {
    long countByExample(Crt2CRrguaranteesumExample example);

    int deleteByExample(Crt2CRrguaranteesumExample example);

    int insert(Crt2CRrguaranteesum record);

    int insertSelective(Crt2CRrguaranteesum record);

    List<Crt2CRrguaranteesum> selectByExample(Crt2CRrguaranteesumExample example);

    int updateByExampleSelective(@Param("record") Crt2CRrguaranteesum record, @Param("example") Crt2CRrguaranteesumExample example);

    int updateByExample(@Param("record") Crt2CRrguaranteesum record, @Param("example") Crt2CRrguaranteesumExample example);
}