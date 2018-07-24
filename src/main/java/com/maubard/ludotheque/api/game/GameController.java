package com.maubard.ludotheque.api.game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {

    @GetMapping("/games")
    @ResponseBody
    public String getGames() {
        return "coucou";
    }
}
