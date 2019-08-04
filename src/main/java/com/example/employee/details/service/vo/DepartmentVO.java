package com.example.employee.details.service.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "dept")
@Data
public class DepartmentVO {
	private String deptId;
	private String deptName;
}