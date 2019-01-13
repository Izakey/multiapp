package com.isaac.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String index() throws Exception {
    return "Hello World From First Micro-service!";
  }
}