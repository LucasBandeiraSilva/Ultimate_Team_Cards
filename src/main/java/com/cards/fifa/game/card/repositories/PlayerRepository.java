package com.cards.fifa.game.card.repositories;

import com.cards.fifa.game.card.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Long> {

}
