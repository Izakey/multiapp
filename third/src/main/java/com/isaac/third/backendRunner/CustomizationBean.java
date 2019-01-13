package com.isaac.third.backendRunner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;

public class CustomizationBean implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

  @Value( "/third" )
  private String contextPath;

  @Value( "8112" )
  private Integer port;

  @Override
  public void customize(ConfigurableServletWebServerFactory factory) {
    factory.setContextPath(contextPath);
    factory.setPort(port);
  }
}