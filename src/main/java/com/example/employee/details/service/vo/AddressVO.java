package com.example.employee.details.service.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "address")
@Data
public class AddressVO {
	private String doorNo;
	private String street;
	private String area;
	private String city;
}