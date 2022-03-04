package ch.colinregamey.MyCar;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/* -- Déclaration de variable --------------------------------------------------------------------------------------- */
        String valueAnswer;
        Scanner scanCars = new Scanner(System.in);
/* -- initialitation du tableau ------------------------------------------------------------------------------------- */
        ArrayList<Voiture> voitureArrayList = new ArrayList<>();
/* -- Condition tant que l'utilisateur met oui la condition continue ------------------------------------------------ */
        do {
/* -- Demander à l'utilisateur si il veut entrer une marque de voiture ---------------------------------------------- */
            System.out.println("Voulez vous entrer une marque de voiture ? (o/n)");
            valueAnswer = scanCars.next();
            if (Objects.equals(valueAnswer, "o")) {
                System.out.println("Entrer une marque de voiture");

                voitureArrayList.add(new Voiture(scanCars.next()));
            }
        } while (Objects.equals(valueAnswer, "o"));
        if (!voitureArrayList.isEmpty()) {
            System.out.println("Voici la liste des voitures:");
            for (Voiture v : voitureArrayList) {
                System.out.println(v.marque);
            }
        } else{
            System.out.println("Il n'y a pas de voiture");
        }
    }
}
