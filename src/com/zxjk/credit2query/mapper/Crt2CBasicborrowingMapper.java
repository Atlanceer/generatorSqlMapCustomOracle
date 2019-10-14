package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CBasicborrowing;
import com.zxjk.credit2query.pojo.Crt2CBasicborrowingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CBasicborrowingMapper {
    long countByExample(Crt2CBasicborrowingExample example);

    int deleteByExample(Crt2CBasicborrowingExample example);

    int insert(Crt2CBasicborrowing record);

    int insertSelective(Crt2CBasicborrowing record);

    List<Crt2CBasicborrowing> selectByExample(Crt2CBasicborrowingExample example);

    int updateByExampleSelective(@Param("record") Crt2CBasicborrowing record, @Param("example") Crt2CBasicborrowingExample example);

    int updateByExample(@Param("record") Crt2CBasicborrowing record, @Param("example") Crt2CBasicborrowingExample example);
}