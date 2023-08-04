package org.horace.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "nacos-provider")
public interface NacosProviderFeignClient {

    @GetMapping("/health")
    String health(@RequestParam("name") String name);
}
