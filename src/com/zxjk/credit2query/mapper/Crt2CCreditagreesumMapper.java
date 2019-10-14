package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CCreditagreesum;
import com.zxjk.credit2query.pojo.Crt2CCreditagreesumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CCreditagreesumMapper {
    long countByExample(Crt2CCreditagreesumExample example);

    int deleteByExample(Crt2CCreditagreesumExample example);

    int insert(Crt2CCreditagreesum record);

    int insertSelective(Crt2CCreditagreesum record);

    List<Crt2CCreditagreesum> selectByExample(Crt2CCreditagreesumExample example);

    int updateByExampleSelective(@Param("record") Crt2CCreditagreesum record, @Param("example") Crt2CCreditagreesumExample example);

    int updateByExample(@Param("record") Crt2CCreditagreesum record, @Param("example") Crt2CCreditagreesumExample example);
}