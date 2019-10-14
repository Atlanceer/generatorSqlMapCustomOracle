package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CCreaditprompts;
import com.zxjk.credit2query.pojo.Crt2CCreaditpromptsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CCreaditpromptsMapper {
    long countByExample(Crt2CCreaditpromptsExample example);

    int deleteByExample(Crt2CCreaditpromptsExample example);

    int insert(Crt2CCreaditprompts record);

    int insertSelective(Crt2CCreaditprompts record);

    List<Crt2CCreaditprompts> selectByExample(Crt2CCreaditpromptsExample example);

    int updateByExampleSelective(@Param("record") Crt2CCreaditprompts record, @Param("example") Crt2CCreaditpromptsExample example);

    int updateByExample(@Param("record") Crt2CCreaditprompts record, @Param("example") Crt2CCreaditpromptsExample example);
}