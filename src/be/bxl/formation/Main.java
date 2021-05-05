package be.bxl.formation;

import be.bxl.formation.models.Duree;

public class Main {

    public static void main(String[] args) {
        Duree d1 = new Duree(3600);
        Duree d2 = new Duree(0,0,3,0);
        Duree d3 = new Duree(0,39,0,0);

        System.out.println("Valeurs initiales");
        System.out.println(d1.getDuree());
        System.out.println(d2.getDuree());
        System.out.println(d3.getDuree());


        System.out.println("Operation d3+d2");

        d3.addDuree(d2);

        System.out.println(d3.getDuree());

        System.out.println("Valeurs finales");
        System.out.println(d1.getDuree());
        System.out.println(d2.getDuree());
        System.out.println(d3.getDuree());
    }
}
