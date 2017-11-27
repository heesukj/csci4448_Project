package com.stockscore.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/* Abastract: you cannot create instances of this class so need to have child classes to override
Spring servlet: calls "dispatcherServlet"
Initializer: initialization of how things work in http
* */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class[] getRootConfigClasses() {
		return new Class[] { AppConfig.class };
	}

	@Override
	protected Class[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}