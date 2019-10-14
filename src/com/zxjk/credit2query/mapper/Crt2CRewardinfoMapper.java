package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CRewardinfo;
import com.zxjk.credit2query.pojo.Crt2CRewardinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CRewardinfoMapper {
    long countByExample(Crt2CRewardinfoExample example);

    int deleteByExample(Crt2CRewardinfoExample example);

    int insert(Crt2CRewardinfo record);

    int insertSelective(Crt2CRewardinfo record);

    List<Crt2CRewardinfo> selectByExample(Crt2CRewardinfoExample example);

    int updateByExampleSelective(@Param("record") Crt2CRewardinfo record, @Param("example") Crt2CRewardinfoExample example);

    int updateByExample(@Param("record") Crt2CRewardinfo record, @Param("example") Crt2CRewardinfoExample example);
}