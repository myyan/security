package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * created by heiqie on 2017/3/19.
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public User login(HttpServletRequest request, HttpSession session) {
        return User.builder()
                .username("haozi")
                .password("123")
                .age(22)
                .build();
    }

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login(@RequestParam("username") String username, Model model) {
//        User user = userService.selectOne(username);
//        model.addAttribute("username", user.getUsername());
//        model.addAttribute("password", user.getPassword());
//        return "login";
//    }
//
//    @RequestMapping("/home")
//    public String home(Model model) {
//        User user = User.builder()
//                .username("haozi")
//                .password("123")
//                .age(22)
//                .build();
//        model.addAttribute("user", user);
//        return "home";
//    }
}
