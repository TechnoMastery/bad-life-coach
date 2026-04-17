package fr.benny.badlifecoach.translations;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BadlifecoachAdviseTroll {

    private static final List<String> advisesTroll = List.of(
            "Si t’as un contrôle, ne révise pas. Le stress améliore la créativité.",
            "Envoie 't ki ?' à ton crush à 3h du matin.",
            "Si quelqu’un t’énerve, ignore-le… pendant 3 ans.",
            "T’as plus de batterie ? Éteins ton téléphone, problème réglé.",
            "Si t’es en retard, cours. Si ça marche pas, cours plus vite.",
            "Réponds 'ok' à tout. Même aux trucs graves.",
            "Si tu comprends pas un cours, regarde ailleurs. Peut-être que la réponse est au plafond.",
            "Si tu veux être riche, arrête d’être pauvre.",
            "Ne fais jamais aujourd’hui ce que tu peux oublier demain.",
            "Si t’as faim, bois de l’eau. Ton estomac va oublier.",
            "Parle fort même si t’as tort, ça passe mieux.",
            "Si quelqu’un te regarde, fixe-le encore plus fort. Domine.",
            "Si tu perds, dis que t’avais pas envie de gagner.",
            "Copie sur ton voisin, mais change rien pour aller plus vite.",
            "Si t’as un problème, ignore-le. Il va peut-être disparaître.",
            "Plus tu dors en cours, plus tu rêves de réussir.",
            "Fais semblant de comprendre, ça économise du temps.",
            "Si le prof te regarde, regarde ailleurs. Invisibilité activée.",
            "Si tu sais pas quoi faire, ne fais rien. C’est une stratégie.",
            "Si t’as une idée nulle, fais-la quand même. On sait jamais.",
            "Mets une alarme… et ignore-la.",
            "Si tu veux être populaire, parle plus fort que tout le monde.",
            "Si t’as un doute, fais pire.",
            "Arrive en retard avec confiance, ça devient stylé.",
            "Si t’as pas bossé, dis que t’as révisé dans ta tête.",
            "Si ça marche pas, recommence pareil.",
            "Si t’as peur, fonce sans réfléchir.",
            "Plus c’est compliqué, moins t’essaies.",
            "Si quelqu’un te corrige, dis que c’était un test.",
            "Si t’as pas compris, fais comme si c’était inutile."
    );



    public static String getConseil() {
        int index = ThreadLocalRandom.current().nextInt(advisesTroll.size());
        return advisesTroll.get(index);
    }

    public static int getNiveauNullite() {
        return ThreadLocalRandom.current().nextInt(0, 101);
    }

    public static String getCouleur(int niveau) {
        if (niveau < 30) return "VERT 🟢";
        if (niveau < 70) return "ORANGE 🟠";
        return "ROUGE 🔴";
    }

}