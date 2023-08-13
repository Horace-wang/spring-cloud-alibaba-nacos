package org.horace.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface HealthService {

    @GetMapping("/health")
    String health(@RequestParam("name") String name);
}
