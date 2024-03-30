package org.example.controllers;

import org.example.model.PlayerNew;
import org.example.model.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerController {

    @Autowired
    PlayerService service;

    public PlayerController() {

    }

    public PlayerController(PlayerService service) {
        this.service = service;
    }

    @RequestMapping("/showPlayerForm")
    public String showForm () {
        return "search-player-form";
    }

    //method to handle /processPlayerForm
    @RequestMapping(value = "/processPlayerForm")
    public String processForm(@RequestParam(value = "playerName", defaultValue = "abc") String playerName, Model model) {
      //  String pName = request.getParameter("playerName");
        PlayerNew player = service.getPlayerByName(playerName);
        model.addAttribute("name", playerName);
        model.addAttribute("country", player.getNationality());
        model.addAttribute("dob", player.getBirthDate());
        model.addAttribute("titles", player.getTitles());
        return "player-detail";
    }

}
