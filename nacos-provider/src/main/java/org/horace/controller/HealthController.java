package org.horace.controller;

import org.horace.api.HealthService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController implements HealthService {


    @Override
    public String health(String name) {
        return "hello " + name + ", i am health";
    }
}
