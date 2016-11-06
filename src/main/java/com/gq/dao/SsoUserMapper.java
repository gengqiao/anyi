package com.gq.dao;

import com.gq.beans.SsoUser;
import com.gq.beans.SsoUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SsoUserMapper {
    int countByExample(SsoUserExample example);

    int deleteByExample(SsoUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SsoUser record);

    int insertSelective(SsoUser record);

    List<SsoUser> selectByExample(SsoUserExample example);

    SsoUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SsoUser record, @Param("example") SsoUserExample example);

    int updateByExample(@Param("record") SsoUser record, @Param("example") SsoUserExample example);

    int updateByPrimaryKeySelective(SsoUser record);

    int updateByPrimaryKey(SsoUser record);
}