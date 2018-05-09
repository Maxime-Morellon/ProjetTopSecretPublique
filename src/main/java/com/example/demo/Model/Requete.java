package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Requete {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int ID;

    private Date date;

    private String commande;

    private boolean Statut = false;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCommande() {
        return commande;
    }

    public void setCommande(String commande) {
        this.commande = commande;
    }

    public boolean isStatut() {
        return Statut;
    }

    public void setStatut(boolean statut) {
        Statut = statut;
    }
}
