package com.escalandrum.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class HelloWorldServiceImpl2 implements HelloWorldService {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorldServiceImpl2.class);
	
	@Override
	public String getDesc() {
		
		logger.debug("getDesc() is executed!");
		return "Ejemplo de Hola mundo con Gradle + Spring MVC ";
	}

	@Override
	public String getTitle(String name) {
		logger.debug("getTitle() is executed! $name : {}", name);

		if(StringUtils.isEmpty(name)){
			return "Hola Mundo";
		}else{
			return "Hola " + name;
		}
	}

}
