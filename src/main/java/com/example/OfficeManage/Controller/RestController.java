package com.example.OfficeManage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
public class RestController {
	@PostMapping
	public String postData() {
		return "Hello Shubham";
	}
	@GetMapping
	public String getdata() {
		return "Hello Shubham Kumar";
	}

}
