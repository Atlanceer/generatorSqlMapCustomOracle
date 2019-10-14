package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CViljudgement;
import com.zxjk.credit2query.pojo.Crt2CViljudgementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CViljudgementMapper {
    long countByExample(Crt2CViljudgementExample example);

    int deleteByExample(Crt2CViljudgementExample example);

    int insert(Crt2CViljudgement record);

    int insertSelective(Crt2CViljudgement record);

    List<Crt2CViljudgement> selectByExample(Crt2CViljudgementExample example);

    int updateByExampleSelective(@Param("record") Crt2CViljudgement record, @Param("example") Crt2CViljudgementExample example);

    int updateByExample(@Param("record") Crt2CViljudgement record, @Param("example") Crt2CViljudgementExample example);
}