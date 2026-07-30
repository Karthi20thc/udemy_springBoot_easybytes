package com.eazybytes.beanLifeCycleHooks.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.eazybytes.beanLifeCycleHooks.beans"})
public class Config {
}
