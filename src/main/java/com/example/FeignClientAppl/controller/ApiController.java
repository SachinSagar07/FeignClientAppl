package com.example.FeignClientAppl.controller;

import com.example.FeignClientAppl.service.apiService;
import com.example.FeignClientAppl.service.apiServiceProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableFeignClients(basePackageClasses = apiServiceProxy.class)
public class ApiController implements apiService {
    private apiServiceProxy proxy;

    public ApiController(apiServiceProxy proxy) {
        this.proxy = proxy;
    }

    @Override
    @GetMapping("/FirstClass")
    public List<Object> getName() {
        return proxy.getName();
    }
}
