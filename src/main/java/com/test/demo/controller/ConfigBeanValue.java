package com.test.demo.controller;/**
 * @创建人:YH
 * @创建时间:2019/12/16
 * @描述:
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *@ClassName ConfigBeanValue
 *@Author huaYan
 *@Date 2019/12/16 22:42
 *@Version 1.0
 *@desc
 **/

@Component
public class ConfigBeanValue {

	@Value("${demo.name}")
	private String demoname;

	@Value("${demo.age}")
	private int age;




}
