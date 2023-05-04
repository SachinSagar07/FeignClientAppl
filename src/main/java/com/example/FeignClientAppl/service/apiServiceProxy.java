package com.example.FeignClientAppl.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "apiService",url = "http://localhost:8089/")
public interface apiServiceProxy extends apiService{
}
