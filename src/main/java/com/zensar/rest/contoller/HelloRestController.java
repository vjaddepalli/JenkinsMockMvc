package com.zensar.rest.contoller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class HelloRestController{
  @GetMapping("/hello")
  public String getmessage()
  {
	  System.out.println("Testing say hello");
    return "Welcome to Jenkins Learning";
  }
  
  
  @PostMapping("/greet")
  public ResponseEntity<String> createMessage(@RequestBody String msg) {
	  System.out.println("Message Creating...");
  return new ResponseEntity<String>("Message Created "+msg,HttpStatus.CREATED);
  }
  
}