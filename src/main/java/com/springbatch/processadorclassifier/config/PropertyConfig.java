package com.springbatch.processadorclassifier.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class PropertyConfig {


    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new FileSystemResource("C:\\Users\\sefaz\\IdeaProjects\\projetos\\ProcessadorClassifierJob\\ProcessadorClassifierJob\\config\\security\\application.yml"));
        return configurer;
    }

}
