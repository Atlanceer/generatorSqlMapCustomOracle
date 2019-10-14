package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CAdminpunishment;
import com.zxjk.credit2query.pojo.Crt2CAdminpunishmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CAdminpunishmentMapper {
    long countByExample(Crt2CAdminpunishmentExample example);

    int deleteByExample(Crt2CAdminpunishmentExample example);

    int insert(Crt2CAdminpunishment record);

    int insertSelective(Crt2CAdminpunishment record);

    List<Crt2CAdminpunishment> selectByExample(Crt2CAdminpunishmentExample example);

    int updateByExampleSelective(@Param("record") Crt2CAdminpunishment record, @Param("example") Crt2CAdminpunishmentExample example);

    int updateByExample(@Param("record") Crt2CAdminpunishment record, @Param("example") Crt2CAdminpunishmentExample example);
}