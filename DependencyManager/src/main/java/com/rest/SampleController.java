package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
@RestController
public class SampleController {
	Mono<String> mono = Mono.just("Walter");

	@GetMapping("/getName")
	public String getName() {
		return mono.toString();
	}

}
