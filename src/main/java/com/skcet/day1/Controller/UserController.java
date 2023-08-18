package com.skcet.day1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class UserController {
	@GetMapping("/welcome")
	public String Welcome(){
		return "Welcome String Boot!";
}
}
