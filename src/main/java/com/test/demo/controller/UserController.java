package com.test.demo.controller;/**
 * @创建人:YH
 * @创建时间:2019/12/16
 * @描述:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName UserController
 *@Author huaYan
 *@Date 2019/12/16 22:22
 *@Version 1.0
 *@desc
 **/
@RestController
public class UserController {

	//@Value("${demo.name}")
	//private String demoname;
	//
	//@Value("${demo.age}")
	//private int age;

	@Autowired
	private ConfigBeanValue beanValue;

	@GetMapping("/hello")
	public String hello(){

		System.out.println(beanValue.toString()+"  ");

		System.out.println("修改第一次");

		return "hhh";
	}



}
