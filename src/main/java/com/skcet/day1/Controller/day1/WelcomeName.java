package com.skcet.day1.Controller.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeName {
	@GetMapping("/WelcomeName")
	public String getName() {
		String studenName="iamNeo";
		return  "Welcome "+studenName;
	}
}

