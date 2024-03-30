package org.example.model;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.sql.Date;
@Service
public class PlayerService {
    private List<PlayerNew> players;

    public PlayerService()
    {
        players= Arrays.asList(
                new PlayerNew(1, "Djokovic", "Serbia", new Date(1987-05-22), 81),
                new PlayerNew(2, "Monfils", "France", new Date(1986-07-01), 10),
                new PlayerNew(3, "Isner", "USA", new Date(1985-04-26), 15)
        );
    }

    public PlayerNew getPlayerByName(String name){
        return players.stream().filter(p -> p.getName().equals(name)).findFirst().get();
    }
}
