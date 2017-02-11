package net.slipp;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("helloworld")
	public String helloworld(Model model) {
		return "Hello World !!";
	}

}