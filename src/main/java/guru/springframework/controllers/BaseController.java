package guru.springframework.controllers;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.google.api.Google;
import org.springframework.stereotype.Component;

public abstract class BaseController {

    protected Google google;
    protected ConnectionRepository connectionRepository;

    public BaseController(Google google, ConnectionRepository connectionRepository) {
        this.google = google;
        this.connectionRepository = connectionRepository;
    }

    protected boolean shouldLogIn() {
        return connectionRepository.findPrimaryConnection(Google.class) == null;
    }

    protected String redirectToLoginPage() {
        return "redirect:/connect/google";
    }

}
