package sm.login.login.controller.homeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping(value = "/login")
    public String login() {
        return "/login";
    }

    @GetMapping(value = "/")
    String indexPage() {
        return"/index"; }

}
