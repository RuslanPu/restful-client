package com.javamentor.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/userPage", method = RequestMethod.GET)
    public String userPage(
//            ModelMap model
    ) {
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        List<Role> rolesUser = (List<Role>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
//        user.setRoles(rolesUser);
//        model.addAttribute("user", user);
        return "user/userPage";

    }

    @GetMapping("/test")
    public String getAjax() {
        return "user/testAjax";
    }
}