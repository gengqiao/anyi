package com.gq.service;

import java.util.List;

import com.gq.beans.Contract;
import com.gq.beans.ContractExample;

public interface ContractService {
	/**
	 * 合同的添加
	 * @param contract
	 * @return
	 */
   public int addContract(Contract contract);
   /**
    * 查询合同信息
    * @param contractExample
    * @return
    */
   public List<Contract> selectByExample(ContractExample example);
   
   /**
    * 通过id查询合同信息
    * @param id
    * @return
    */
   public Contract selectByPrimaryKey(Integer id);
   /**
    * 更新订单信息
    * @param contract
    * @return
    */
   public int updContract(Contract contract);
   
   /**
    * 删除订单信息
    * @param id
    * @return
    */
   public int deleteByPrimaryKey(Integer id );
}
