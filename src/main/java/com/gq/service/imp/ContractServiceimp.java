package com.gq.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gq.beans.Contract;
import com.gq.beans.ContractExample;
import com.gq.dao.ContractMapper;
import com.gq.service.ContractService;
@Service("contractServiceimp")
public class ContractServiceimp implements ContractService {
	@Resource 
	ContractMapper contractMapper;
	
	@Override
	public int addContract(Contract contract) {
		// TODO Auto-generated method stub
		return contractMapper.insertSelective(contract);
	}

	@Override
	public List<Contract> selectByExample(ContractExample example) {
		// TODO Auto-generated method stub
		return contractMapper.selectByExample(example);
	}
	public Contract selectByPrimaryKey(Integer id ){
		return contractMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updContract(Contract contract) {
		// TODO Auto-generated method stub
		return contractMapper.updateByPrimaryKey(contract);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return contractMapper.deleteByPrimaryKey(id);
	}
	
}
