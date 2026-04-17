package fr.benny.badlifecoach;

import net.minheur.potoflux.PotoFlux;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BadLifeAdviseHandler {

    private static final List<String> advises = new ArrayList<>();
    private static final Random random = new Random();

    public static void fillAdvises() {
        advises.clear();

        advises.add("T’as encore rien fait aujourd’hui");
        advises.add("Va prendre une douche");
        advises.add("Envoie-lui un message");
        advises.add("Fais tes devoirs");
        advises.add("Arrête ton téléphone");
        advises.add("Bois de l’eau");
        advises.add("Va dormir");
        advises.add("Pourquoi tu es moche");
        advises.add("Benny est le boss");
        advises.add("Franchement, ne change rien, sa a l'air de bien pas marcher");
        advises.add("Si tu continue comme sa tu va rester où tu es");
        advises.add("Continue comme ça et tu sera comme de la merde");
        advises.add("Oublie pas de respirer");
        advises.add("")
    }

    public static void generateAdvise() {
        String advise = advises.get(random.nextInt(advises.size()));

        JOptionPane.showMessageDialog(
                PotoFlux.app.getFrame(),
                advise, "Voici un conseil(ou pas):",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

}
