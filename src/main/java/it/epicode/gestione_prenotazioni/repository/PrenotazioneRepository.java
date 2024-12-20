package it.epicode.gestione_prenotazioni.repository;


import it.epicode.gestione_prenotazioni.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
}
