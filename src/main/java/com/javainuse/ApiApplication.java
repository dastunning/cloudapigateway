package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
//import org.springframework.web.reactive.DispatcherHandler;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

//    @Bean
//    RouteLocator gateway(RouteLocatorBuilder rlb){
//        return rlb
//                .routes()
//                .route(routeSpec -> routeSpec
//                        .path("/api")
//                        .filters( gatewayFilterSpec -> gatewayFilterSpec.setPath("/public")
//                        )
//                        .uri("http://localhost:4081/")
//                ).build();
//    }
}
