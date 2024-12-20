package it.epicode.gestione_prenotazioni.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private Postazione postazione;

    @ManyToOne
    private Utente utente;

    private LocalDate dataPrenotazione;
}
