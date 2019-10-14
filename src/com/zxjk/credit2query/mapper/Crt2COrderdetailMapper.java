package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2COrderdetail;
import com.zxjk.credit2query.pojo.Crt2COrderdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2COrderdetailMapper {
    long countByExample(Crt2COrderdetailExample example);

    int deleteByExample(Crt2COrderdetailExample example);

    int deleteByPrimaryKey(String orderdetailid);

    int insert(Crt2COrderdetail record);

    int insertSelective(Crt2COrderdetail record);

    List<Crt2COrderdetail> selectByExampleWithBLOBs(Crt2COrderdetailExample example);

    List<Crt2COrderdetail> selectByExample(Crt2COrderdetailExample example);

    Crt2COrderdetail selectByPrimaryKey(String orderdetailid);

    int updateByExampleSelective(@Param("record") Crt2COrderdetail record, @Param("example") Crt2COrderdetailExample example);

    int updateByExampleWithBLOBs(@Param("record") Crt2COrderdetail record, @Param("example") Crt2COrderdetailExample example);

    int updateByExample(@Param("record") Crt2COrderdetail record, @Param("example") Crt2COrderdetailExample example);

    int updateByPrimaryKeySelective(Crt2COrderdetail record);

    int updateByPrimaryKeyWithBLOBs(Crt2COrderdetail record);

    int updateByPrimaryKey(Crt2COrderdetail record);
}