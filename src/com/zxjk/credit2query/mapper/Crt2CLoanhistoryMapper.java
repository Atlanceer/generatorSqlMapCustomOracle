package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CLoanhistory;
import com.zxjk.credit2query.pojo.Crt2CLoanhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CLoanhistoryMapper {
    long countByExample(Crt2CLoanhistoryExample example);

    int deleteByExample(Crt2CLoanhistoryExample example);

    int insert(Crt2CLoanhistory record);

    int insertSelective(Crt2CLoanhistory record);

    List<Crt2CLoanhistory> selectByExample(Crt2CLoanhistoryExample example);

    int updateByExampleSelective(@Param("record") Crt2CLoanhistory record, @Param("example") Crt2CLoanhistoryExample example);

    int updateByExample(@Param("record") Crt2CLoanhistory record, @Param("example") Crt2CLoanhistoryExample example);
}