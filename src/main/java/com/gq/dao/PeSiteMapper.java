package com.gq.dao;

import com.gq.beans.PeSite;
import com.gq.beans.PeSiteExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository("peSiteMapper")
public interface PeSiteMapper {
    int countByExample(PeSiteExample example);

    int deleteByExample(PeSiteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PeSite record);

    int insertSelective(PeSite record);

    List<PeSite> selectByExample(PeSiteExample example);

    PeSite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PeSite record, @Param("example") PeSiteExample example);

    int updateByExample(@Param("record") PeSite record, @Param("example") PeSiteExample example);

    int updateByPrimaryKeySelective(PeSite record);

    int updateByPrimaryKey(PeSite record);
}