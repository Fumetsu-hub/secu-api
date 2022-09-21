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
    public Utilisateur index(int age, String mail, int phone) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("Toto");
        utilisateur.setPrenom("Tata");
        utilisateur.setAge(age = 19);
        utilisateur.setMail(mail="toto@gmail.com");
        utilisateur.setPhone(phone = 0606060606);
        
        return utilisateur;
    }

    public UtilisateurRepository getUtilisateurRepository() {
        return utilisateurRepository;
    }

    public void setUtilisateurRepository(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }
}
