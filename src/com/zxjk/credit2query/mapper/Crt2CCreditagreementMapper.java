package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CCreditagreement;
import com.zxjk.credit2query.pojo.Crt2CCreditagreementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CCreditagreementMapper {
    long countByExample(Crt2CCreditagreementExample example);

    int deleteByExample(Crt2CCreditagreementExample example);

    int insert(Crt2CCreditagreement record);

    int insertSelective(Crt2CCreditagreement record);

    List<Crt2CCreditagreement> selectByExample(Crt2CCreditagreementExample example);

    int updateByExampleSelective(@Param("record") Crt2CCreditagreement record, @Param("example") Crt2CCreditagreementExample example);

    int updateByExample(@Param("record") Crt2CCreditagreement record, @Param("example") Crt2CCreditagreementExample example);
}