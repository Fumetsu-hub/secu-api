package fr.levitt.secuapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.levitt.secuapi.core.Utilisateur;
import fr.levitt.secuapi.sql.UtilisateurRepository;

@RestController
public class IndexController {

    @Autowired
    private UtilisateurRepository utilisateurRepository;


    @GetMapping("/newUser")
    public void addRandomUser() {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("Toto"+Math.random());
        utilisateur.setPrenom("Tata"+Math.random());
        utilisateurRepository.save(utilisateur);
    }

    @GetMapping("/user")
    public Iterable<Utilisateur> getUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @GetMapping("/")
    public Utilisateur index(Integer age, String mail, String phone) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("Toto");
        utilisateur.setPrenom("Tata");
        utilisateur.setAge(19);
        utilisateur.setMail("toto@gmail.com");
        utilisateur.setPhone( "0606060606");
        
        return utilisateur;
    }

    public UtilisateurRepository getUtilisateurRepository() {
        return utilisateurRepository;
    }

    public void setUtilisateurRepository(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }
}
