package com.lcp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lcp.model.User;
import com.lcp.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController{
@Resource
private IUserService userService;
@RequestMapping("/showUser.do")
public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException{
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    long userId = Long.parseLong(request.getParameter("id"));
    User user = this.userService.selectUser(userId);
    String a="aaaaaaaa";
    System.out.println(a);
    System.out.println("我终于成功了！！");
    ObjectMapper mapper = new ObjectMapper();
    response.getWriter().write(mapper.writeValueAsString(user));
    response.getWriter().close();
}
}
