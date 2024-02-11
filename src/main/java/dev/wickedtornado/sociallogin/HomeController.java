package dev.wickedtornado.sociallogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/")
	public String home(){
		return "hello anmol";
	}
	
	@GetMapping("/secured")
	public String secured() {
		return "hello secured monga";
	}

}
