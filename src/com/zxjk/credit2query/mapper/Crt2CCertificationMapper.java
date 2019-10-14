package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CCertification;
import com.zxjk.credit2query.pojo.Crt2CCertificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CCertificationMapper {
    long countByExample(Crt2CCertificationExample example);

    int deleteByExample(Crt2CCertificationExample example);

    int insert(Crt2CCertification record);

    int insertSelective(Crt2CCertification record);

    List<Crt2CCertification> selectByExample(Crt2CCertificationExample example);

    int updateByExampleSelective(@Param("record") Crt2CCertification record, @Param("example") Crt2CCertificationExample example);

    int updateByExample(@Param("record") Crt2CCertification record, @Param("example") Crt2CCertificationExample example);
}