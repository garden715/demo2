package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  @GetMapping("/")
  public String hello() {
    return "hello";
  }

  @GetMapping("/hi")
  public String hello2() {
    return "hi";
  }
}
