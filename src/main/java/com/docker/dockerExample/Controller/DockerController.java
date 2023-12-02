package com.docker.dockerExample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/docker")
	public String Docker(@RequestParam String param)
	{

		return "Your Message: "+param+"\n"+"docker is working fine";
	}

}
