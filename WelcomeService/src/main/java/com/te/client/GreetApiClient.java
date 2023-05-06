package com.te.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name = "client")
public interface GreetApiClient {
	
	
	@GetMapping(path = "/client/goodmorning")
	public String invokeGreetApi();

}
