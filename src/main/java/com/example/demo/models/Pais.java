package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "paises")
@Data
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais") 
    private Long id;

    @Column(name = "descripcion")  // 👈 esto es lo importante
    
    private String nombre;
}
