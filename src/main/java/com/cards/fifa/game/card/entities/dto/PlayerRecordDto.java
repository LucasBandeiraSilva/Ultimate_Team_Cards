package com.cards.fifa.game.card.entities.dto;

import com.cards.fifa.game.card.entities.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.sql.Date;

public record PlayerRecordDto(@NotNull(message = "the age should not be null") int age, @NotBlank(message = "the birthday should not be null")
Date birthday, @NotBlank(message = "the player must have a name") String name,
                              @NotBlank(message = "the player must have a club")String club,
                              @NotBlank(message = "the player must have a country")String country,
                              @NotBlank(message = "the player must have a league")String league,
                              Pace pace, Passing passing, Defending defending, Shooting finishing,
                              Physicality physicality,
                              Dribbling dribbling) {
}
