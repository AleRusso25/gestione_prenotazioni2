package it.epicode.gestione_prenotazioni.service;




import it.epicode.gestione_prenotazioni.model.Postazione;
import it.epicode.gestione_prenotazioni.repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {
    @Autowired
    private PostazioneRepository repository;

    public List<Postazione> findAll() {
        return repository.findAll();
    }

    public Postazione save(Postazione postazione) {
        return repository.save(postazione);
    }
}
