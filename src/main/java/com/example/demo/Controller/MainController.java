package com.example.demo.Controller;

import com.example.demo.Model.Requete;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class MainController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/test")
    public @ResponseBody String Ontest(){
        Requete requete = new Requete();
        requete.setCommande("srrer");
        requete.setDate(new Date());
        requete.setStatut(true);
        userRepository.save(requete);
        return "saved";
    }
}
