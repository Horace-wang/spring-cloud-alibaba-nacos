package org.horace.feign;

import org.horace.api.HealthService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "nacos-provider")
public interface NacosProviderFeignClient extends HealthService {

}
