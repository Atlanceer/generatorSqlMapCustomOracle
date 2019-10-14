package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CActualcontroller;
import com.zxjk.credit2query.pojo.Crt2CActualcontrollerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CActualcontrollerMapper {
    long countByExample(Crt2CActualcontrollerExample example);

    int deleteByExample(Crt2CActualcontrollerExample example);

    int insert(Crt2CActualcontroller record);

    int insertSelective(Crt2CActualcontroller record);

    List<Crt2CActualcontroller> selectByExample(Crt2CActualcontrollerExample example);

    int updateByExampleSelective(@Param("record") Crt2CActualcontroller record, @Param("example") Crt2CActualcontrollerExample example);

    int updateByExample(@Param("record") Crt2CActualcontroller record, @Param("example") Crt2CActualcontrollerExample example);
}