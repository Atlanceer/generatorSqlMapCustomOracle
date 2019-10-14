package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CRatinginf;
import com.zxjk.credit2query.pojo.Crt2CRatinginfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CRatinginfMapper {
    long countByExample(Crt2CRatinginfExample example);

    int deleteByExample(Crt2CRatinginfExample example);

    int insert(Crt2CRatinginf record);

    int insertSelective(Crt2CRatinginf record);

    List<Crt2CRatinginf> selectByExample(Crt2CRatinginfExample example);

    int updateByExampleSelective(@Param("record") Crt2CRatinginf record, @Param("example") Crt2CRatinginfExample example);

    int updateByExample(@Param("record") Crt2CRatinginf record, @Param("example") Crt2CRatinginfExample example);
}