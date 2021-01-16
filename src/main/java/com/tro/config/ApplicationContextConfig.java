package com.tro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
@ComponentScan("com.tro.config")
public class ApplicationContextConfig {

   @Bean(name = "viewResolver")
   public ViewResolver getViewResolver() {
       UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();

       // TilesView 3
       viewResolver.setViewClass(TilesView.class);

       return viewResolver;
   }

   @Bean
   
	   public TilesConfigurer tilesConfigurer() {
		    TilesConfigurer configurer = new TilesConfigurer();
		    configurer.setDefinitions("/WEB-INF/**/tiles.xml");
		    return configurer;
		  }
		
   
   //config for upload file
   @Bean(name = "multipartResolver")
    public MultipartResolver getMultipartResolver() {
        CommonsMultipartResolver resover = new CommonsMultipartResolver();
        // 1MB
        resover.setMaxUploadSize(1 * 1024 * 1024);
 
        return resover;
    }

}