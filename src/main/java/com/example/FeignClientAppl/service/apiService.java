package com.example.FeignClientAppl.service;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface apiService {
    @GetMapping("/FirstClass")
    public List<Object> getName();
}
