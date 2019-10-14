package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CQualification;
import com.zxjk.credit2query.pojo.Crt2CQualificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CQualificationMapper {
    long countByExample(Crt2CQualificationExample example);

    int deleteByExample(Crt2CQualificationExample example);

    int insert(Crt2CQualification record);

    int insertSelective(Crt2CQualification record);

    List<Crt2CQualification> selectByExample(Crt2CQualificationExample example);

    int updateByExampleSelective(@Param("record") Crt2CQualification record, @Param("example") Crt2CQualificationExample example);

    int updateByExample(@Param("record") Crt2CQualification record, @Param("example") Crt2CQualificationExample example);
}