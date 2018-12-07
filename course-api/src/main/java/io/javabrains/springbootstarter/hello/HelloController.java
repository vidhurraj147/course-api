package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "HI";
	}
	
	@RequestMapping("/bye")
	public String sayBye() {
		return "<b>bye</bye>";
	}
}
