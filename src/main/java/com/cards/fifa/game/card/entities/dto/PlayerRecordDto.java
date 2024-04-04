package com.cards.fifa.game.card.entities.dto;

import com.cards.fifa.game.card.entities.*;

public record PlayerRecordDto(String age, String birthday, String name, String club, String country, String league,
                              Pace pace, Passing passing, Defending defending, Shooting shooting,
                              Physicality physicality,
                              Dribbling dribbling) {
}
