package com.tlite.RedditLookAlike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
//@Import(SwaggerConfiguration.class)
public class RedditLookAlikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedditLookAlikeApplication.class, args);
	}

}
