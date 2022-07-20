package com.d202.ijoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {


    @GetMapping("")
    public String index(){
        // 머스테치 기본폴더 src/main/resources/
        // 뷰리졸버 설정 : templates(prefix)
        return "index";
    }

    @GetMapping("/user")
    public String user(){
        return "user";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/manager")
    public String manager(){
        return "manager";
    }

    @GetMapping("/login")
    public String login(){
        return "loginForm";
    }

    @GetMapping("/join")
    public String join(){
        return "join";
    }

    @ResponseBody
    @GetMapping("/joinProc")
    public String joinProc(){
        return "회원가입 완료됨!";
    }
}
