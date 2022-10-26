package pl.coderslab.charity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.User;
import pl.coderslab.charity.service.UserService;

@Controller
@RequestMapping("/register")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }
    @PostMapping("/add")
    public String saveUser(User user) {

        if (user.getPassword().equals(user.getPassword2())) {
            userService.saveUser(user);
            return "form6";
        }
        return "redirect:/register/add";
    }
}
