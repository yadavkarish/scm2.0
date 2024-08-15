package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    /**
     * This method is mapped to the "/home" URL and handles the GET request.
     * It adds an attribute "name" with the value "scm" to the model object.
     * The view name "home" is returned, which is the name of the HTML template
     * that will be rendered for this request.
     *
     * @param model the Model object used to store attributes for the view
     * @return the name of the view to render ("home")
     */
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home page");
        model.addAttribute("name", "scm");
        return "home";
    }

    /**
     * This method is mapped to the "/about" URL and handles the GET request.
     * It adds no attributes to the model object.
     * The view name "about" is returned, which is the name of the HTML template
     * that will be rendered for this request.
     *
     * @param model the Model object used to store attributes for the view
     * @return the name of the view to render ("about")
     */
    @RequestMapping("/about")
    public String about(Model model) {
        System.out.println("about Page");
        return "about";
    }

    /**
     * This method is mapped to the "/service" URL and handles the GET request.
     * It adds no attributes to the model object.
     * The view name "service" is returned, which is the name of the HTML template
     * that will be rendered for this request.
     *
     * @param model the Model object used to store attributes for the view
     * @return the name of the view to render ("service")
     */
    @RequestMapping("/service")
    public String service(Model model) {
        System.out.println("service Page");
        // model.addAttribute("name", "scm");
        return "service";
    }

    @RequestMapping("/contact")
    public String contact(Model model) {
        System.out.println("contact Page");

        return "contact";
    }

    @RequestMapping("/login")
    public String login() {
        System.out.println("login Page");
        return "login";
    }

    @RequestMapping("/signup")
    public String signup() {
        System.out.println("signup Page");
        return "signup";
    }


}
