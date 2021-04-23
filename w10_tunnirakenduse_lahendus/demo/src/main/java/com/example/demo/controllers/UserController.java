package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

  @GetMapping("/signup")
  public String showSignUp(User user){
    return "signup";
  }

  @PostMapping("/addUser")
  public String addUser(@Valid User user, BindingResult result, Model model){
    if (result.hasErrors()){
      return "signup";
    }

    userRepository.save(user);
    return "redirect:/index";
  }
}
