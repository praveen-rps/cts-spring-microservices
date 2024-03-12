package com.examples.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.examples.beans","com.examples.model"})
public class ComponentConfiguration {

}
