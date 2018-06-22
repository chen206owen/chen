package com.chen.controller;

import com.chen.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @RequestMapping("/getMemberUser")
    public List<String> getMemberUser(){
        return memberService.getMemberUser();
    }
}
