package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class color {
	private String yourFavColor="Black";
	@GetMapping("/")
	public String getMyFav() {
		return "My Favorite Color is "+yourFavColor;
	}

}