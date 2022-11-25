package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import net.javaguides.sms.entity.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/users")
    public String ifUnless(Model model){
        User jyoti = new User("jyoti","jyoti@gmail.com", "ADMIN", "M");
        User admin = new User("admin","admin@gmail.com", "ADMIN", "M");
        User meena = new User("meena","meena@gmail.com", "USER", "F");
        List<User> users = new ArrayList<>();
        users.add(jyoti);
        users.add(admin);
        users.add(meena);
        model.addAttribute("users", users);
        return "users";
    }
}
