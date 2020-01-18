package br.com.kesley.numerosporextenso.config;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@EnableWebMvc
public class WebConfig extends WebMvcConfigurationSupport {

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/swagger-ui.html**")//
				.addResourceLocations("classpath:/resources/swagger-ui.html");

		registry.addResourceHandler("/webjars/**") //
				.addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}
