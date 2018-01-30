package com.qinmei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qinmei.dao.EmpMapper;
import com.qinmei.pojo.Emp;
import com.qinmei.service.EmpService;

/**
 * 员工业务接口实现
 * <p>Company: www.qinmei.com</p> 
 * @author 史恒飞 ，tel ： 18516417728
 * @version 1.0 ， 2018年1月25日上午9:59:25
 */
@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	public EmpMapper empMapper;
	
	@Override
	public Emp getEmpById(int id) {
		Emp emp = empMapper.selectByPrimaryKey(id);
		return emp;
	}

}
