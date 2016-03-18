package com.joypupil.study.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

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
}
