package fr.levitt.secuapi.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue
    private int idUtilisateur;
    private String nom;
    private String prenom;
    private Integer age;
    private String phone;
    private String mail;

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

   
    public void setAge(Integer age){
        this.age = age;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Integer getAge(){
        return age;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }


    
}
