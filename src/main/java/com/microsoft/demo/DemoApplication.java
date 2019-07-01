package com.microsoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication { 
	
	public static void main(String[] args) { 
		
		System.out.println("docker 镜像启动！！！！！");
		
		System.out.println("Hello  Azure DevOps !!!!!!!!!!! Test Azure DevOps");
		
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
