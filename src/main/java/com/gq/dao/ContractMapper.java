package com.gq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.gq.beans.Contract;
import com.gq.beans.ContractExample;
@Repository("contractMapper")
public interface ContractMapper {
    int countByExample(ContractExample example);

    int deleteByExample(ContractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Contract record);

    int insertSelective(Contract record);

    List<Contract> selectByExample(ContractExample example);

    Contract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByExample(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}