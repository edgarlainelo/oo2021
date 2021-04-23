package com.example.demo.controllers;

import com.example.demo.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
  
  private final UserRepository userRepository;

  @Autowired
  public UserController(UserRepository userRepository){
    this.userRepository = userRepository;
  }

  @GetMapping("/index")
  public String showUserList(Model model){
    model.addAttribute("users", userRepository.findAll());
    return "index";
  }
}
