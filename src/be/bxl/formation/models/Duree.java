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

    private void setJours(int jours) {
        this.jours = jours;
    }

    private void setHeures(int heures) {
        this.heures = heures;
    }

    private void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    private void setSecondes(int secondes) {
        this.secondes = secondes;
    }
    //endregion


    //region Constructors
    public Duree(int nbSecondes){
        int nbMinutes, nbHeures;
        this.setSecondes(nbSecondes%60);
        nbMinutes=(nbSecondes-this.getSecondes())/60;
        this.setMinutes(nbMinutes%60);
        nbHeures = (nbMinutes-this.getMinutes())/60;
        this.setHeures(nbHeures%24);
        this.setJours(nbHeures/24);
    }

    public Duree(int jour, int heure, int minute, int seconde){

    }
    //endregion

    //region Methodes
    public String getDuree (){
        String message =this.getJours()+" jours "+this.getHeures()+" heures "+this.getMinutes()+" minutes "
                +this.getSecondes()+" secondes ";
        return message;
    }

    public int getTotalSeconde(){
        int totalSec;
        totalSec = (getJours()*86400)+(getHeures()*360)+(getMinutes()*60)+getSecondes();
        return totalSec;
    }

    public void subDuree(Duree aSoustraire){

    }

    public void addDuree(Duree aAjouter){

    }
    //endregion

}
