package com.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/follow")
public class WebappController {
@GetMapping(value="/also")
public String getunit() {
	return "whom";
}
}
