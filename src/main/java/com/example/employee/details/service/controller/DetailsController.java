package com.example.employee.details.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.details.service.vo.AddressVO;
import com.example.employee.details.service.vo.DepartmentVO;
import com.example.employee.details.service.vo.EmployeeVO;

@RestController
public class DetailsController {

	@Autowired
	private AddressVO addressVO;

	@Autowired
	private DepartmentVO departmentVO;

	@Autowired
	private EmployeeVO employeeVO;

	@RequestMapping(value = "/profile", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeVO getEmployeeVO() {
		return employeeVO;

	}
	
	@RequestMapping(value = "/address", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public AddressVO getAddressVO() {
		return addressVO;

	}
	
	@RequestMapping(value = "/dept", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public DepartmentVO getDepartmentVO() {
		return departmentVO;

	}
}
