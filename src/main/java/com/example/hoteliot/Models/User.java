package com.example.hoteliot.Models;

public class User {
    private long id ;
    private String prenom , nom ,email, cin;


    public User(long id, String prenom, String nom, String email, String cin) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.cin = cin;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", cin='" + cin + '\'' +
                '}';
    }
}
