package com.thyng.metrics;

import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThyngMetricsApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(ThyngMetricsApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ThyngMetricsApplication.class);
	}
	
	@Bean
	public CustomEditorConfigurer customEditorConfigurer() {
		final Map<Class<?>, Class<? extends PropertyEditor>> editors = new HashMap<>();
		final CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
		customEditorConfigurer.setCustomEditors(editors);
		return customEditorConfigurer;
	}
	
	
}
