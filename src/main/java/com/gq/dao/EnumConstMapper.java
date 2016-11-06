package com.gq.dao;

import com.gq.beans.EnumConst;
import com.gq.beans.EnumConstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnumConstMapper {
    int countByExample(EnumConstExample example);

    int deleteByExample(EnumConstExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnumConst record);

    int insertSelective(EnumConst record);

    List<EnumConst> selectByExample(EnumConstExample example);

    EnumConst selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnumConst record, @Param("example") EnumConstExample example);

    int updateByExample(@Param("record") EnumConst record, @Param("example") EnumConstExample example);

    int updateByPrimaryKeySelective(EnumConst record);

    int updateByPrimaryKey(EnumConst record);
}