package pl.olointeria.movieclub.domain.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class AdminController {
    public static final String NOTIFICATION_ATTRIBUTE = "notification";

    @GetMapping("/admin")
    public String getAdminPanel() {
        return "admin/admin";
    }
}
