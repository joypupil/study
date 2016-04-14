package com.joypupil.study.application;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(TestSetting.class)
public class StudyApplication implements EmbeddedServletContainerCustomizer {
	private static int port = 8080;
	public static void main(String[] args) throws Exception {
		if(args.length > 0){
			port = Integer.parseInt(args[0]);
		}
		SpringApplication.run(StudyApplication.class, args);
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(port);
	}
	
	@Bean  
    public MultipartConfigElement multipartConfigElement() {  
        MultipartConfigFactory factory = new MultipartConfigFactory();  
        factory.setMaxFileSize("512MB");  
        factory.setMaxRequestSize("512MB");  
        return factory.createMultipartConfig();  
    }  
}
