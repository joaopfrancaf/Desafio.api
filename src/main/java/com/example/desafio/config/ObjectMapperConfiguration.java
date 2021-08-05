package com.example.desafio.config;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ObjectMapperConfiguration {

	 @Autowired
	    private ObjectMapper objectMapper;

	    @PostConstruct
	    void objectMapperSetup() {
	        objectMapper.setTimeZone(TimeZone.getDefault());
	        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	    }

	    @Bean
	    Jackson2JsonMessageConverter jackson2JsonMessageConverter() {
	        return new Jackson2JsonMessageConverter(objectMapper);
	    }
}
