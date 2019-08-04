package com.example.employee.details.service.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.example.employee.details.service.vo.AddressVO;
import com.example.employee.details.service.vo.DepartmentVO;
import com.example.employee.details.service.vo.EmployeeVO;

@Configuration
@EnableConfigurationProperties({ AddressVO.class, DepartmentVO.class, EmployeeVO.class })
public class ServiceConfig {

}
