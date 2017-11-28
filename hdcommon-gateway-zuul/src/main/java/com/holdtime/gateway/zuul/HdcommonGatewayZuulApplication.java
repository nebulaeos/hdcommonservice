package com.holdtime.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class HdcommonGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdcommonGatewayZuulApplication.class, args);
	}
}
