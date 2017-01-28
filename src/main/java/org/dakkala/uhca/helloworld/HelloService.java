package org.dakkala.uhca.helloworld;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

	@RequestMapping("/hello/{name}")
	public ResponseEntity<String> hello(@PathParam("name") String name) {
		GreetingMessage gm=new GreetingMessage();
		String greeting=gm.getGreeting(name);
		return new ResponseEntity<String>(greeting, HttpStatus.OK);
	}
}
