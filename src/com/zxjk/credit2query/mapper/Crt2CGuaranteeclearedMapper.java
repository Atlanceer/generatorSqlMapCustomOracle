package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CGuaranteecleared;
import com.zxjk.credit2query.pojo.Crt2CGuaranteeclearedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CGuaranteeclearedMapper {
    long countByExample(Crt2CGuaranteeclearedExample example);

    int deleteByExample(Crt2CGuaranteeclearedExample example);

    int insert(Crt2CGuaranteecleared record);

    int insertSelective(Crt2CGuaranteecleared record);

    List<Crt2CGuaranteecleared> selectByExample(Crt2CGuaranteeclearedExample example);

    int updateByExampleSelective(@Param("record") Crt2CGuaranteecleared record, @Param("example") Crt2CGuaranteeclearedExample example);

    int updateByExample(@Param("record") Crt2CGuaranteecleared record, @Param("example") Crt2CGuaranteeclearedExample example);
}