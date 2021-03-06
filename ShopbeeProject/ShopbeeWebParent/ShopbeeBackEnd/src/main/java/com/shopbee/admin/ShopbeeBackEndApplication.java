package com.shopbee.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.shopbee.common.entity.", "com.shopbee.admin.user"})
public class ShopbeeBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopbeeBackEndApplication.class, args);
	}

}
