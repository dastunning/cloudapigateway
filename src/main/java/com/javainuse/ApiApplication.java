package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
//import org.springframework.web.reactive.DispatcherHandler;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Bean
    public RouteLocator gateway(RouteLocatorBuilder rlb){
        //System.out.println("requestURI" + request.getRequestURI());

        return rlb
                .routes()
                .route(routeSpec -> routeSpec
                        .path("/api/**")
                        //.filters(gatewayFilterSpec -> gatewayFilterSpec.setPath("/api/public/parking/list"))
                        .uri("https://mobile-dev.smartparking.kz")
                )
                .route(routeSpec -> routeSpec
                        .path("/payment/**")
//                        .filters(gatewayFilterSpec -> gatewayFilterSpec.setPath("/payment/check"))
                        .uri("https://api.parqour.com")
                )
                .build();
    }
}
