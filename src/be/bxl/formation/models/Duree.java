package be.bxl.formation.models;

public class Duree {

    private int totalSeconde;

    //region Constructors
    public Duree(int nbSeconde) {
        this.setTotalSeconde(nbSeconde);
    }

    public Duree(int jour, int heure, int minute, int seconde) {
        if(jour < 0 || heure < 0 || minute < 0 || seconde < 0) {
            throw new IllegalArgumentException("Durée invalide !");
        }
        this.setTotalSeconde((jour * 86400); + (heure * 3600) + (minute * 60) + seconde);
    }
    //endregion

    //region Getters
    public int getTotalSeconde() {
        return totalSeconde;
    }

    public int getJour() {
        return totalSeconde/86400;
    }

    public int getHeure() {
        return (totalSeconde/3600) % 24;
    }

    public int getMinute() {
        return (totalSeconde/60) % 60;
    }

    public int getSeconde() {
        return totalSeconde % 60;
    }

    public String getDuree(){
        return String.format("%s jour %s heure %sminute %s seconde",
                getJour(), getHeure(), getMinute(), getSeconde());
    }
    //endregion

    //region Setters
    private void setTotalSeconde(int seconde){
        if(seconde<0){
            throw new IllegalArgumentException("Les durées négatives ne sont pas gére!");
        }
        this.totalSeconde = seconde;
    }
    //endregion

    //region Methodes
    public void addDuree(Duree aAjouter){
        int valeur = this.getTotalSeconde() + aAjouter.getTotalSeconde();
        this.setTotalSeconde(valeur);
    }

    public void subDuree(Duree aSoustraire){
        int valeur = this.getTotalSeconde() - aSoustraire.getTotalSeconde();
        this.setTotalSeconde(valeur);
    }
    //endregion

}
