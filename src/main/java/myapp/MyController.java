package myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    private final RestClientService service;

    @Autowired
    public MyController(RestClientService service){
       this.service = service;
    }
    
    //get all profiles
    //the returns the home.html page
    @GetMapping("home")
    public String getAll(Model model){
        model.addAttribute("profiles", service.findAllProfile());
        return "home";
    }

    //get specific profile by id
    //then returns profileveiw.html
    @RequestMapping("/profile/{id}")
    public String getById(@PathVariable String id, Model model){
        model.addAttribute("profile", service.findProfileById(id));
        return "profileview";
    }
}
