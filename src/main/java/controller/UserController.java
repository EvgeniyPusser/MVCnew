package controller;





import model.User;
import repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

    @Controller
    public class UserController {

        private final UserRepository userRepository;

        public UserController(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        @GetMapping("/users")
        public String getUsers(Model model) {
            List<User> users = userRepository.findAll();
            model.addAttribute("users", users);
            return "user-list";
        }
    }


