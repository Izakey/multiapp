package com.isaac.first.backendRunner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;

public class CustomizationBean implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

  @Value( "/first" )
  private String contextPath;

  @Value( "8110" )
  private Integer port;

  @Override
  public void customize(ConfigurableServletWebServerFactory factory) {
    factory.setContextPath(contextPath);
    factory.setPort(port);
  }
}