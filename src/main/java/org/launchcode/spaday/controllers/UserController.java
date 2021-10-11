package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.asm.Attribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping
    public String displayAddUserForm( Model model){
        model.addAttribute(new User());
        return "user/add";
    }

    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute @Valid User user, String verify) {
        // add form submission handling code here
        System.out.println("User: "+ user.getUsername() + ", Pass:" + user.getPassword());
        System.out.println("Verify pass: "+ verify);

        if(!user.getPassword().equals(verify)){
            model.addAttribute("error","Passwords do not match");
            return "user/add";
        }

        return "user/index";
    }



}
