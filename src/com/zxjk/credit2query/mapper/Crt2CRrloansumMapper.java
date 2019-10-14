package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CRrloansum;
import com.zxjk.credit2query.pojo.Crt2CRrloansumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CRrloansumMapper {
    long countByExample(Crt2CRrloansumExample example);

    int deleteByExample(Crt2CRrloansumExample example);

    int insert(Crt2CRrloansum record);

    int insertSelective(Crt2CRrloansum record);

    List<Crt2CRrloansum> selectByExample(Crt2CRrloansumExample example);

    int updateByExampleSelective(@Param("record") Crt2CRrloansum record, @Param("example") Crt2CRrloansumExample example);

    int updateByExample(@Param("record") Crt2CRrloansum record, @Param("example") Crt2CRrloansumExample example);
}