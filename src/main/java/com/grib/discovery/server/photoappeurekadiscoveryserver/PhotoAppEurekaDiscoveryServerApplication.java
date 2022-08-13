package com.grib.discovery.server.photoappeurekadiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PhotoAppEurekaDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppEurekaDiscoveryServerApplication.class, args);
    }

}
