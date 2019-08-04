package com.example.employee.details.service.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "employee")
@Data
public class EmployeeVO {
	private int id;
	private String firstName;
	private String LastName;
}