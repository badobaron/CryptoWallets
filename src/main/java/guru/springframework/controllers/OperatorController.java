package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.google.api.Google;
import org.springframework.social.google.api.plus.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OperatorController extends BaseController {

    @Autowired
    public OperatorController(Google google, ConnectionRepository connectionRepository) {
        super(google, connectionRepository);
    }

    @RequestMapping(value = "operator/wallets", method = RequestMethod.GET)
    public String getAllWallets(Model model) {
        if(shouldLogIn()) {
            return redirectToLoginPage();
        }
        Person user = google.plusOperations().getGoogleProfile();
        model.addAttribute("googleProfile", user);
        return "index";
    }

    @RequestMapping(value = "operator/wallets", method = RequestMethod.POST)
    public String createWalletFromAPassword(Model model) {
        if(shouldLogIn()) {
            return redirectToLoginPage();
        }
        Person user = google.plusOperations().getGoogleProfile();
        model.addAttribute("googleProfile", user);
        return "index";
    }

    @RequestMapping(value = "operator/wallets/{walletId}", method = RequestMethod.GET)
    public String getWalletById(Model model) {
        if(shouldLogIn()) {
            return redirectToLoginPage();
        }
        Person user = google.plusOperations().getGoogleProfile();
        model.addAttribute("googleProfile", user);
        return "index";
    }

    @RequestMapping(value = "operator/wallets/{walletId}/transactions", method = RequestMethod.POST)
    public String createANewTransaction(Model model) {
        if(shouldLogIn()) {
            return redirectToLoginPage();
        }
        Person user = google.plusOperations().getGoogleProfile();
        model.addAttribute("googleProfile", user);
        return "index";
    }

    @RequestMapping(value = "operator/wallets/{walletId}/addresses", method = RequestMethod.GET)
    public String getAllAddressesOfAWallet(Model model) {
        if(shouldLogIn()) {
            return redirectToLoginPage();
        }
        Person user = google.plusOperations().getGoogleProfile();
        model.addAttribute("googleProfile", user);
        return "index";
    }

    @RequestMapping(value = "operator/wallets/{walletId}/addresses", method = RequestMethod.POST)
    public String createANewAddress(Model model) {
        if(shouldLogIn()) {
            return redirectToLoginPage();
        }
        Person user = google.plusOperations().getGoogleProfile();
        model.addAttribute("googleProfile", user);
        return "index";
    }

    @RequestMapping(value = "operator/wallets/{walletId}/addresses/{addressId}/balance", method = RequestMethod.POST)
    public String getTheBalanceOfAGivenAddressAndWallet(Model model) {
        if(shouldLogIn()) {
            return redirectToLoginPage();
        }
        Person user = google.plusOperations().getGoogleProfile();
        model.addAttribute("googleProfile", user);
        return "index";
    }

}
