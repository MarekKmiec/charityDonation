package pl.coderslab.charity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.User;
import pl.coderslab.charity.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    private final UserService userService;


    public LoginController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/")
    public String login(Model model){
        model.addAttribute("user", new User());
        return "login";
    }
    @PostMapping("/")
    public String loginMain(User user){

        System.out.println(user);
        List<User> users=userService.findAll();
        for (User user1 : users) {
            if(user.getEmail().equals(user1.getEmail()) && user.getPassword().equals(user1.getPassword())){
                return"redirect:/donation/add";
            }
        }
        return "redirect:/login/";
    }
}
