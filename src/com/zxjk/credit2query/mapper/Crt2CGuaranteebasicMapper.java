package com.zxjk.credit2query.mapper;

import com.zxjk.credit2query.pojo.Crt2CGuaranteebasic;
import com.zxjk.credit2query.pojo.Crt2CGuaranteebasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Crt2CGuaranteebasicMapper {
    long countByExample(Crt2CGuaranteebasicExample example);

    int deleteByExample(Crt2CGuaranteebasicExample example);

    int insert(Crt2CGuaranteebasic record);

    int insertSelective(Crt2CGuaranteebasic record);

    List<Crt2CGuaranteebasic> selectByExample(Crt2CGuaranteebasicExample example);

    int updateByExampleSelective(@Param("record") Crt2CGuaranteebasic record, @Param("example") Crt2CGuaranteebasicExample example);

    int updateByExample(@Param("record") Crt2CGuaranteebasic record, @Param("example") Crt2CGuaranteebasicExample example);
}