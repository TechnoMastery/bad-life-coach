package fr.benny.badlifecoach;

import java.util.ArrayList;
import java.util.List;

public class BadLifeAdviseHandler {

    private static final List<String> advises = new ArrayList<>();

    public static void fillAdvises() {
        advises.add("T’as encore rien fait aujourd’hui");
        advises.add("Va prendre une douche");
        advises.add("Envoie-lui un message");
        advises.add("Fais tes devoirs");
        advises.add("Arrête ton téléphone");
        advises.add("Bois de l’eau");
        advises.add("Va dormir");
    }

    public static void generateAdvise() {

    }

}
