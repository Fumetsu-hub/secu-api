package fr.levitt.secuapi;

import fr.levitt.secuapi.core.Utilisateur;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

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
}
