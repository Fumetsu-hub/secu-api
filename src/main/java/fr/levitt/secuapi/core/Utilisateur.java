package fr.levitt.secuapi.core;

public class Utilisateur {

    private String nom;
    private String prenom;
    private int age;
    private int phone;
    private String mail;

   
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

   
    public void setAge(int age){
        this.age = age;
    }

    public void setPhone(int phone){
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

    public int getAge(){
        return age;
    }

    public String getMail() {
        return mail;
    }

    public int getPhone() {
        return phone;
    }


    
}
