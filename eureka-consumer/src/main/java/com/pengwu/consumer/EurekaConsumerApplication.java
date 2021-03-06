package com.pengwu.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 创建提供服务的客户端，并向服务注册中心注册自己。
 * 在服务提供方中尝试着提供一个接口来获取当前所有的服务信息。
 */
@SpringBootApplication
@EnableDiscoveryClient	//@EnableDiscoveryClient注解，能激活Eureka中的DiscoveryClient实现，这样才能实现Controller中对服务信息的输出。
public class EurekaConsumerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerApplication.class)
        		.web(true).run(args);
    }
    
    @Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
    
}