package com.cards.fifa.game.card.controller;

import com.cards.fifa.game.card.entities.Player;
import com.cards.fifa.game.card.entities.dto.PlayerRecordDto;
import com.cards.fifa.game.card.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping()
    public ResponseEntity<List<Player>>findAllPlayers(){
        return ResponseEntity.status(200).body(playerService.findAllPlayers());
    }
    @PostMapping()
    public ResponseEntity<Player>createPlayer(@RequestBody PlayerRecordDto playerRecordDto){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(playerService.createPlayer(playerRecordDto));
    }
}
