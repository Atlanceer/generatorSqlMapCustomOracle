package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2COrder;
import com.zxjk.credit2query.pojo.Crt2COrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2COrderMapper {
    long countByExample(Crt2COrderExample example);

    int deleteByExample(Crt2COrderExample example);

    int deleteByPrimaryKey(String orderid);

    int insert(Crt2COrder record);

    int insertSelective(Crt2COrder record);

    List<Crt2COrder> selectByExample(Crt2COrderExample example);

    Crt2COrder selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") Crt2COrder record, @Param("example") Crt2COrderExample example);

    int updateByExample(@Param("record") Crt2COrder record, @Param("example") Crt2COrderExample example);

    int updateByPrimaryKeySelective(Crt2COrder record);

    int updateByPrimaryKey(Crt2COrder record);
}