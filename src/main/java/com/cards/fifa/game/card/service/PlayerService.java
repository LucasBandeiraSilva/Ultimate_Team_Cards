package com.cards.fifa.game.card.service;

import com.cards.fifa.game.card.entities.Player;
import com.cards.fifa.game.card.entities.dto.PlayerRecordDto;
import com.cards.fifa.game.card.repositories.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private PaceRepository paceRepository;
    @Autowired
    private DefendingRepository defendingRepository;
    @Autowired
    private DribblingRepository dribblingRepository;
    @Autowired
    private PassingRepository passingRepository;
    @Autowired
    private PhysicalityRepository physicalityRepository;
    @Autowired
    private  ShootingRepository shootingRepository;

    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    public Player createPlayer(PlayerRecordDto playerRecordDto) {
        var player = new Player();
        BeanUtils.copyProperties(playerRecordDto, player);
        System.out.println("Age: " + player.getAge());
        System.out.println("Birthday: " + player.getBirthday());
        System.out.println("defense: " + player.getDefending());
        System.out.println("skill: " + player.getDribbling());
        System.out.println("shoot: " + player.getFinishing());
        System.out.println("pass: " + player.getPassing());
        System.out.println("pace: " + player.getPace());

        paceRepository.save(player.getPace());
        passingRepository.save(player.getPassing());
        shootingRepository.save(player.getFinishing());
        dribblingRepository.save(player.getDribbling());
        defendingRepository.save(player.getDefending());
        physicalityRepository.save(player.getPhysicality());
        playerRepository.save(player);
        return player;
    }

    public Player updatePlayerById(Long id, PlayerRecordDto playerRecordDto){
        var player = new Player();
        BeanUtils.copyProperties(playerRecordDto, player);
        paceRepository.save(player.getPace());
        passingRepository.save(player.getPassing());
        shootingRepository.save(player.getFinishing());
        dribblingRepository.save(player.getDribbling());
        defendingRepository.save(player.getDefending());
        physicalityRepository.save(player.getPhysicality());
        playerRepository.save(player);
        return player;
    }
}
