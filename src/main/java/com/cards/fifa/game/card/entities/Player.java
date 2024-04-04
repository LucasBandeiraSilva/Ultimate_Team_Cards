package com.cards.fifa.game.card.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int age;
    private Date birthday;
    private String name;
    private String country;
    private String club;
    private String league;
    @ManyToOne
    private Pace pace;
    @ManyToOne
    private Shooting finishing;
    @ManyToOne
    private Passing passing;
    @ManyToOne
    private Dribbling dribbling;
    @ManyToOne
    private Defending defending;
    @ManyToOne
    private Physicality physicality;
}
