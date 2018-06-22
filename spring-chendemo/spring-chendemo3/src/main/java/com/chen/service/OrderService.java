package com.chen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
@Service
public class OrderService {
    @Autowired
    RestTemplate restTemplate;

    public List<String> getOrderByMemberList(){
        return restTemplate.getForObject("http://chen-member/getMemberUser", List.class);
    }
}
