package com.chen.controller;

import com.chen.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/getOrderByMemberList")
    public List<String> getMemberUser(){
        return orderService.getOrderByMemberList();
    }
}
