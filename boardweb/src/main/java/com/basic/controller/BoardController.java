package com.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@GetMapping("/boardwrite")
	public String boardwrite() {
		return "board/boardwrite";
	}
}
