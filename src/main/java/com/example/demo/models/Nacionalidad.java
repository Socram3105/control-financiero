package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "nacionalidades") 
@Data
public class Nacionalidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nacionalidad")  // 
    private Long id;

    private String descripcion;
}
