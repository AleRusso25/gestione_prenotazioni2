package it.epicode.gestione_prenotazioni.runner;


import it.epicode.gestione_prenotazioni.model.Edificio;
import it.epicode.gestione_prenotazioni.model.Postazione;
import it.epicode.gestione_prenotazioni.model.TipoPostazione;
import it.epicode.gestione_prenotazioni.model.Utente;
import it.epicode.gestione_prenotazioni.repository.EdificioRepository;
import it.epicode.gestione_prenotazioni.repository.PostazioneRepository;
import it.epicode.gestione_prenotazioni.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private EdificioRepository edificioRepository;

    @Autowired
    private PostazioneRepository postazioneRepository;

    @Autowired
    private UtenteRepository utenteRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Utente utente = new Utente();
        utente.setNomeCompleto("Mario Rossi");
        utente.setEmail("mario.rossi@example.com");
        utenteRepository.save(utente);

        Edificio edificio = new Edificio();
        edificio.setNome("Edificio 2");
        edificio.setIndirizzo("Via Caldieri 1");
        edificio.setCitta("Roma");
        edificioRepository.save(edificio);

        Postazione postazione = new Postazione();
        postazione.setCodice("P002");
        postazione.setDescrizione("Postazione privata");
        postazione.setTipo(TipoPostazione.PRIVATO);
        postazione.setMaxOccupanti(2);
        postazione.setEdificio(edificio);
        postazioneRepository.save(postazione);
    }
}
