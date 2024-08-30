package com.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.dto.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HomeController {

//		@GetMapping ("/add/{a}/{b}")
//		public int addMark (@PathVariable("a") int op1, @PathVariable("b") int op2) {
//		return op1+op2;
//	}
//		@GetMapping("/sub")
//		public int addmark(@RequestParam("a")int l1,@RequestParam("b") int l2) {
//			return l1+l2;
//		}
	@PostMapping("/save")
	public String saveUserData(@RequestBody User users) {
		if (users.getUserName().equals("leeon")) {
			return ("valid username");
		}
		return ("invalid username");

	}

}
