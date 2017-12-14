package guru.springframework.controllers;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.google.api.Google;
import org.springframework.social.google.api.plus.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoogleController extends BaseController {

    public GoogleController(Google google, ConnectionRepository connectionRepository) {
        super(google, connectionRepository);
    }

    @RequestMapping("/")
    public String connectToGoogle(Model model) {
        if(shouldLogIn()) {
            return redirectToLoginPage();
        }
        Person user = google.plusOperations().getGoogleProfile();

        System.out.println(google.isAuthorized());
        System.out.println(": "+user.getGivenName() +" : "+ user.getEmailAddresses() +" : "+ user.getFamilyName());
        model.addAttribute("googleProfile", user);
        return "index";
    }


}
