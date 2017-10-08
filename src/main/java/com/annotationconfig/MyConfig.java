package com.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration //Annotation based configuration Class(Xml file was our configur, but in order to make annotation as our config file then need to use this annotation)
@ComponentScan({"com.controller"})// Similar to base-package-scan in xml file where we scan all the annotation used..
//we can put multiple anntaion base package soo Allow us to use {} array
public class MyConfig {
	//similar like ur xml file where u write all ur bean 

	//View Resolver
	
	@Bean
	public InternalResourceViewResolver m1() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/output/");
		vr.setSuffix(".jsp");
		return vr;
	}

}
