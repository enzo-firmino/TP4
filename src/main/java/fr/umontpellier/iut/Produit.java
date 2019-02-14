package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Produit {

    private int num;
    private String description;
    private double prixCourant;
    private LocalDate dateDebut;
    private LocalTime heureDebut;
    private static double enchereMinim;
    private double coutParticipation;
    private ArrayList<OffreEnchere> listeOffreEnchere;


    public Produit(int num, String description, double prixCourant, double coutParticipation) {
        this.num = num;
        this.description = description;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
    }

    public void modifEnchereMinim(int newEnchereMinim){
        enchereMinim = newEnchereMinim;
    }

    public Compte demarrerEnchere(String description, double prixCourant, double coutParticipation){
        


    }


    public void ajouterOffre(OffreEnchere offreEnchere){
        listeOffreEnchere.add(offreEnchere);

    }



















    @Override
    public String toString() {
        return "Produit{" +
                "num=" + num +
                ", description='" + description + '\'' +
                ", prixCourant=" + prixCourant +
                ", dateDebut=" + dateDebut +
                ", heureDebut=" + heureDebut +
                ", coutParticipation=" + coutParticipation +
                '}';
    }
}


