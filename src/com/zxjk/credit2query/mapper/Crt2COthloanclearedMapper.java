package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2COthloancleared;
import com.zxjk.credit2query.pojo.Crt2COthloanclearedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2COthloanclearedMapper {
    long countByExample(Crt2COthloanclearedExample example);

    int deleteByExample(Crt2COthloanclearedExample example);

    int insert(Crt2COthloancleared record);

    int insertSelective(Crt2COthloancleared record);

    List<Crt2COthloancleared> selectByExample(Crt2COthloanclearedExample example);

    int updateByExampleSelective(@Param("record") Crt2COthloancleared record, @Param("example") Crt2COthloanclearedExample example);

    int updateByExample(@Param("record") Crt2COthloancleared record, @Param("example") Crt2COthloanclearedExample example);
}