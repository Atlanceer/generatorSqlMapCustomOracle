package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CLoancleared;
import com.zxjk.credit2query.pojo.Crt2CLoanclearedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CLoanclearedMapper {
    long countByExample(Crt2CLoanclearedExample example);

    int deleteByExample(Crt2CLoanclearedExample example);

    int insert(Crt2CLoancleared record);

    int insertSelective(Crt2CLoancleared record);

    List<Crt2CLoancleared> selectByExample(Crt2CLoanclearedExample example);

    int updateByExampleSelective(@Param("record") Crt2CLoancleared record, @Param("example") Crt2CLoanclearedExample example);

    int updateByExample(@Param("record") Crt2CLoancleared record, @Param("example") Crt2CLoanclearedExample example);
}