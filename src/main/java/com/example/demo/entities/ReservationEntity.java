package com.example.demo.entities;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor @AllArgsConstructor
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date debut;
    private Date fin;

    @ManyToOne
    private SalleEntity salle;
    @ManyToOne
    private UserEntity user;
}
