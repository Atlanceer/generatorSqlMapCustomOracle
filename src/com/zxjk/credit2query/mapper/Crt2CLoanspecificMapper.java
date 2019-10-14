package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CLoanspecific;
import com.zxjk.credit2query.pojo.Crt2CLoanspecificExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CLoanspecificMapper {
    long countByExample(Crt2CLoanspecificExample example);

    int deleteByExample(Crt2CLoanspecificExample example);

    int insert(Crt2CLoanspecific record);

    int insertSelective(Crt2CLoanspecific record);

    List<Crt2CLoanspecific> selectByExample(Crt2CLoanspecificExample example);

    int updateByExampleSelective(@Param("record") Crt2CLoanspecific record, @Param("example") Crt2CLoanspecificExample example);

    int updateByExample(@Param("record") Crt2CLoanspecific record, @Param("example") Crt2CLoanspecificExample example);
}