package com.skcet.day1.FavColor;


	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/api")
	public class FavColor {
		@GetMapping("/FavColor")
		public String getName() {
			String favcolor="Yellow";
			return  "My FavColor "+favcolor;
		}
	}

