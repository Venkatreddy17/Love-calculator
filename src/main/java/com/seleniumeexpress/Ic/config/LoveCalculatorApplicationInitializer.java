package com.seleniumeexpress.Ic.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
         
         AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
         webApplicationContext.register(LoveCalculatorAppConfig.class);
         //create a dispacher servlet object
		DispatcherServlet dispatcherServlet=new DispatcherServlet(webApplicationContext);
		
		//Registered dispacher servlet with servlet context
		ServletRegistration.Dynamic myCustomDispacherServlet=servletContext.addServlet("myDispacherServlet", dispatcherServlet);
		
		myCustomDispacherServlet.setLoadOnStartup(1);
		myCustomDispacherServlet.addMapping("/mywebsite.com/*");
	}

}
