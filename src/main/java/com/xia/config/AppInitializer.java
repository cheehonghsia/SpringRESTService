package com.xia.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer{

	private static final String MAPPING_URL = "/";
	private static final String DISPATCHER_SERVLET = "DispatcherServlet";

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(ApplicationContextConfig.class);

		ServletRegistration.Dynamic dispatcher = servletContext.addServlet(DISPATCHER_SERVLET, new DispatcherServlet(appContext));
		
		dispatcher.setLoadOnStartup(1);
		
		dispatcher.addMapping(MAPPING_URL);
		
	}
}