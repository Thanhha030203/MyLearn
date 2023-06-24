package com.PS20520.controller;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class MessageConfig {
	 @Bean("messageSource")
	 public MessageSource getMessageSource () { 
		 ReloadableResourceBundleMessageSource ms = new ReloadableResourceBundleMessageSource();
		 ms.setBasename("classpath:student");
		 ms.setDefaultEncoding("utf-8");
		 return ms;
	 }
}
