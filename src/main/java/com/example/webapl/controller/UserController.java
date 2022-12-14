package com.example.webapl.controller;

import com.example.webapl.domain.Users;
import com.example.webapl.repos.UsersRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.Map;


@Controller
@PreAuthorize("hasAuthority('ADMIN')")
public class UserController {
    @Autowired
    private UsersRep usersRep;

    @GetMapping("/userList")
    public String userList(Map<String, Object> model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Iterable<Users> user = usersRep.findAll();
        model.put("user", user);
//        model.put("auth", auth.getPrincipal());
        return "userList";
    }

//    @GetMapping("{users}")
//    public String userEditForm(@PathVariable Users users, Model model) {
//        model.addAttribute("users", users);
//        model.addAttribute("roles", Role.values());
//
//        return "userEdit";
//    }

//    @GetMapping("/role")
//    public String usersEdit(Role role, Model model) {
//        model.addAttribute("roles", role);
//
//        return "userEdit";
//    }
}