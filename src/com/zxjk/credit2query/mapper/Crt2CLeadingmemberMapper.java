package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CLeadingmember;
import com.zxjk.credit2query.pojo.Crt2CLeadingmemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CLeadingmemberMapper {
    long countByExample(Crt2CLeadingmemberExample example);

    int deleteByExample(Crt2CLeadingmemberExample example);

    int insert(Crt2CLeadingmember record);

    int insertSelective(Crt2CLeadingmember record);

    List<Crt2CLeadingmember> selectByExample(Crt2CLeadingmemberExample example);

    int updateByExampleSelective(@Param("record") Crt2CLeadingmember record, @Param("example") Crt2CLeadingmemberExample example);

    int updateByExample(@Param("record") Crt2CLeadingmember record, @Param("example") Crt2CLeadingmemberExample example);
}