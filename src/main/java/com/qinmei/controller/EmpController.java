package com.qinmei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qinmei.pojo.Emp;
import com.qinmei.service.EmpService;

/**
 * 员工控制器
 * <p>Company: www.qinmei.com</p> 
 * @author 史恒飞 ，tel ： 18516417728
 * @version 1.0 ， 2018年1月25日上午10:32:58
 */
@Controller
public class EmpController {

	@Autowired
	public EmpService empService;
	
	@RequestMapping("emp/{empId}")
	@ResponseBody
	public Emp getEmpById(@PathVariable Integer empId){
		Emp emp = empService.getEmpById(empId);
		return emp;
	}
	
}
