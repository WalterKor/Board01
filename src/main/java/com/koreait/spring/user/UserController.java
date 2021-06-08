package com.koreait.spring.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//서블릿으로부터 연결 맷핑담당
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login") //2차주소값
    public String login(){
        return "user/login";
    }

    @GetMapping("/join")
    public String join(){
        return "user/join";
    }
}
