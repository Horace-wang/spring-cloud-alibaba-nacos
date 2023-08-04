package org.horace.controller;

import org.horace.feign.NacosProviderFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthConsumerController {

    private final NacosProviderFeignClient nacosProviderFeignClient;

    public HealthConsumerController(NacosProviderFeignClient nacosProviderFeignClient) {
        this.nacosProviderFeignClient = nacosProviderFeignClient;
    }


    @GetMapping("/health")
    public String health(String name) {
        return nacosProviderFeignClient.health(name);
    }
}
