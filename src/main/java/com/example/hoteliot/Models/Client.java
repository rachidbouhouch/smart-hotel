package com.example.hoteliot.Models;

public class Client extends User{
    private String telephone;
    private String address;
    private String pays;
    private String ville;

    public Client(long id, String prenom, String nom, String email, String cin, String telephone, String address, String pays,String ville) {
        super(id, prenom, nom, email, cin);
        this.telephone = telephone;
        this.address = address;
        this.pays = pays;
        this.ville=ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Client{" +super.toString()+
                "telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", pays='" + pays + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
