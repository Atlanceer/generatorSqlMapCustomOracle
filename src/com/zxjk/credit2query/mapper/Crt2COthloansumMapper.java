package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2COthloansum;
import com.zxjk.credit2query.pojo.Crt2COthloansumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2COthloansumMapper {
    long countByExample(Crt2COthloansumExample example);

    int deleteByExample(Crt2COthloansumExample example);

    int insert(Crt2COthloansum record);

    int insertSelective(Crt2COthloansum record);

    List<Crt2COthloansum> selectByExample(Crt2COthloansumExample example);

    int updateByExampleSelective(@Param("record") Crt2COthloansum record, @Param("example") Crt2COthloansumExample example);

    int updateByExample(@Param("record") Crt2COthloansum record, @Param("example") Crt2COthloansumExample example);
}