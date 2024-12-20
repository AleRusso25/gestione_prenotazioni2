package it.epicode.gestione_prenotazioni.model;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String codice;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;

    private int maxOccupanti;

    @ManyToOne
    private Edificio edificio;
}
