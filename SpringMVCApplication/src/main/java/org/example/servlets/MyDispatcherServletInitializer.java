package org.example.servlets;

import org.example.model.PlayerConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { PlayerConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/spring/*" };
    }
}