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
        advises.add("Bois de l’eau. Ça résout au moins 0,3% de tes problèmes.");
        advises.add("Va dormir");
        advises.add("Pourquoi tu es moche");
        advises.add("Benny est le boss");
        advises.add("Franchement, ne change rien, sa a l'air de bien pas marcher");
        advises.add("Si tu continues comme ça, tu vas rester exactement où tu es.");
        advises.add("T’as essayé… de faire un effort ? Juste pour voir ?");
        advises.add("C’est pas que tu fais mal, c’est que tu fais rien.");
        advises.add("Au moins, tu es constant. Constamment inefficace.");
        advises.add("Respire. Voilà, tu progresses déjà plus que ce matin.");
        advises.add("Si t’as la flemme, allonge-toi encore plus.");
        advises.add("Fais une pause. De toute façon t’avais pas commencé.");
        advises.add("Réfléchis moins, ça changera rien au résultat.");
        advises.add("Organise ton bordel. Ou pas, ça reste du bordel.");
        advises.add("Visualise ton succès. Maintenant retourne procrastiner.");
        advises.add("Fixe-toi des objectifs. Ignore-les ensuite.");
        advises.add("Sors de ta zone de confort. Ou reste, ça a l’air cosy.");
        advises.add("Deviens la meilleure version de toi-même. Demain.");
        advises.add("Commence petit. Genre vraiment petit. Genre rien.");
        advises.add("Travaille dur. Ou fais semblant, c’est déjà ça.");
        advises.add("À ce rythme-là, t’es large pour rater.");
        advises.add("T’as le temps… de tout repousser.");
        advises.add("Pourquoi faire aujourd’hui ce que tu peux regretter demain ?");
        advises.add("Franchement, abandonner maintenant, c’est gagner du temps.");
        advises.add("T’es fatigué ? Repose-toi de ta fatigue.");
        advises.add("Le succès, c’est surfait.");
        advises.add("Même ton futur toi te juge.");
        advises.add("T’as réussi à perdre du temps efficacement, bravo.");
        advises.add("Si la médiocrité était un sport, tu serais pro.");
        advises.add("On dirait que t’essaies… de ne pas essayer.");
        advises.add("T’es pas en retard, t’es hors course.");
        advises.add("Si t’as un problème, deviens le problème.");
        advises.add("Ignore tes responsabilités, elles finiront peut-être par t’oublier.");
        advises.add("Plus tu fais rien, moins tu peux échouer. C’est mathématique.");
        advises.add("Si ça marche pas, regarde ailleurs.");
        advises.add("Fais confiance au chaos, il a plus d’expérience que toi.");
        advises.add("Si tu continue comme sa tu va rester où tu es");
        advises.add("Continue comme ça et tu sera comme de la merde");
        advises.add("Oublie pas de respirer");
        advises.add("Tu ne sera jamais meilleur, alors ameliore toi");
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
