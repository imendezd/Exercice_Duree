package be.bxl.formation.models;

public class Duree {

    private int jours;
    private int heures;
    private int minutes;
    private int secondes;

    //region Getters

    public int getJours() {
        return jours;
    }

    public int getHeures() {
        return heures;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSecondes() {
        return secondes;
    }
    //endregion

    //region Setters
    public void setJours(int jours) {
        this.jours = jours;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }
    //endregion

    //region Constructors
    public Duree(int nbSecondes){
        setSecondes(nbSecondes);
    }

    public Duree(int jour, int heure, int minute, int seconde){
        setJours(jour);
        setHeures(heure);
        setMinutes(minute);
        setSecondes(seconde);
    }
    //endregion

    //region Methodes

    //endregion

}
