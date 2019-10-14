package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CComminspect;
import com.zxjk.credit2query.pojo.Crt2CComminspectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CComminspectMapper {
    long countByExample(Crt2CComminspectExample example);

    int deleteByExample(Crt2CComminspectExample example);

    int insert(Crt2CComminspect record);

    int insertSelective(Crt2CComminspect record);

    List<Crt2CComminspect> selectByExample(Crt2CComminspectExample example);

    int updateByExampleSelective(@Param("record") Crt2CComminspect record, @Param("example") Crt2CComminspectExample example);

    int updateByExample(@Param("record") Crt2CComminspect record, @Param("example") Crt2CComminspectExample example);
}