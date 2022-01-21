package com.example.hoteliot.Models;

public class Receptionniste extends User{
    private String username ;
    private String motdepasse;

    public Receptionniste(long id, String prenom, String nom, String email, String cin, String username, String motdepasse) {
        super(id, prenom, nom, email, cin);
        this.username = username;
        this.motdepasse = motdepasse;
    }

    @Override
    public String toString() {
        return "Receptionniste{" + super.toString()+
                "username='" + username + '\'' +
                ", motdepasse='" + motdepasse + '\'' +
                '}';
    }
}
