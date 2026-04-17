package fr.benny.badlifecoach.troll;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class BadlifecoachAdviseTroll {

    private static final List<String> redAdvises = List.of(
            "Envoie 't ki ?' à ton crush à 3h du matin.",
            "Si t’as une idée nulle, fais-la quand même. On sait jamais.",
            "Si ta mère te soule, met lui une claque",
            "Réponds 'ok' à tout. Même aux trucs graves.",
            "Si le prof te regarde, regarde ailleurs. Invisibilité activée.",
            "Si le prof de demande de prendre la porte, prend la porte en la devissant"
            );
    private static final List<String> orangeAdvises = List.of(
            "Si quelqu’un t’énerve, ignore-le… pendant 3 ans.",
            "Si t’as un contrôle, ne révise pas. Le stress améliore la créativité.",
            "Si t’as faim, bois de l’eau. Ton estomac va oublier.",
            "Copie sur ton voisin, mais change rien pour aller plus vite.",
            "Si tu comprends pas un cours, regarde ailleurs. Peut-être que la réponse est au plafond.",
            "Si t’as un problème, ignore-le. Il va peut-être disparaître.",
            "Fais semblant de comprendre, ça économise du temps.",
            "Mets une alarme… et ignore-la.",
            "Plus c’est compliqué, moins t’essaies.",
            "Si t’as pas bossé, dis que t’as révisé dans ta tête.",
            "Si ça marche pas, recommence pareil.",
            "Si t’as peur, fonce sans réfléchir.",
            "Comme le dicton le dis : femme qui rit a moitiée dans ton lit!"
    );
    private static final List<String> greenAdvises = List.of(
            "tu n'arrive pas à réflechier, arrête",
            "Si t’as pas compris, fais comme si c’était inutile.",
            "T’as plus de batterie ? Éteins ton téléphone, problème réglé.",
            "Parle fort même si t’as tort, ça passe mieux.",
            "Si quelqu’un te regarde, fixe-le encore plus fort. Domine.",
            "Si tu perds, dis que t’avais pas envie de gagner.",
            "Ne fais jamais aujourd’hui ce que tu peux oublier demain.",
            "Si t’es en retard, cours. Si ça marche pas, cours plus vite.",
            "Si tu veux être riche, arrête d’être pauvre.",
            "Si tu sais pas quoi faire, ne fais rien. C’est une stratégie.",
            "Si quelqu’un te corrige, dis que c’était un test.",
            "Plus tu dors en cours, plus tu rêves de réussir.",
            "Si tu veux être populaire, parle plus fort que tout le monde.",
            "Si t’as un doute, fais pire.",
            "Arrive en retard avec confiance, ça devient stylé.",
            "Si tu es en retard en arrivant, dis bonjour a ton prof normalement"
    );

    private static final Map<BadnessLevel, List<String>> allAdvises = new HashMap<>();

    public static void load() {
        allAdvises.put(BadnessLevel.GREEN, greenAdvises);
        allAdvises.put(BadnessLevel.ORANGE, orangeAdvises);
        allAdvises.put(BadnessLevel.RED, redAdvises);
    }

    public static String getAdvise(BadnessLevel level) {
        List<String> list = allAdvises.get(level);

        int index = ThreadLocalRandom.current().nextInt(list.size());
        return list.get(index);
    }

}