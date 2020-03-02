package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

@RestController
public class MainController {
	
	  @ApiImplicitParams({
          @ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 access_token", required = false, dataType = "String", paramType = "header")
  })
	@RequestMapping("/main")
	public String main()
	{
		return "Hello World";
	}
	
	  @ApiImplicitParams({
          @ApiImplicitParam(name = "Authorization", value = "로그인 성공 후 access_token", required = false, dataType = "String", paramType = "header")
  })
	@RequestMapping("/test")
	public String test()
	{
		return "Hello World2";
	}

}
