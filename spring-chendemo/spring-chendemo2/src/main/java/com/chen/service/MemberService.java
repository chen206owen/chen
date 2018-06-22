package com.chen.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    public List<String> getMemberUser(){
        List<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        return list;
    }
}
