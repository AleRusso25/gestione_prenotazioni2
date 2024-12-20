package it.epicode.gestione_prenotazioni.model;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;
    private String username;
    private String nomeCompleto;
    private String email;
}

