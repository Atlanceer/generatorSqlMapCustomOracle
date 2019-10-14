package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CInstblsheet97;
import com.zxjk.credit2query.pojo.Crt2CInstblsheet97Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CInstblsheet97Mapper {
    long countByExample(Crt2CInstblsheet97Example example);

    int deleteByExample(Crt2CInstblsheet97Example example);

    int insert(Crt2CInstblsheet97 record);

    int insertSelective(Crt2CInstblsheet97 record);

    List<Crt2CInstblsheet97> selectByExample(Crt2CInstblsheet97Example example);

    int updateByExampleSelective(@Param("record") Crt2CInstblsheet97 record, @Param("example") Crt2CInstblsheet97Example example);

    int updateByExample(@Param("record") Crt2CInstblsheet97 record, @Param("example") Crt2CInstblsheet97Example example);
}