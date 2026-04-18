package fr.benny.badlifecoach;

import net.minheur.potoflux.PotoFlux;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class AdviseProvider {

    private static final List<String> redAdvises = List.of(
            "Envoie 't ki ?' à ton crush à 3h du matin.",
            "Si t’as une idée nulle, fais-la quand même. On sait jamais.",
            "Si ta mère te soule, met lui une claque",
            "Réponds 'ok' à tout. Même aux trucs graves.",
            "Si le prof te regarde, regarde ailleurs. Invisibilité activée.",
            "Si le prof de demande de prendre la porte, prend la porte en la dévissant",
            "Comme le dicton le dis : femme qui rit a moitié dans ton lit!",
            "Benny est le boss. Ouais c'est en HARDDD car c'est choquant nan ?",
            "Même ton futur toi te juge.",
            "Si la médiocrité était un sport, tu serais pro.",
            "On dirait que t’essaies… de ne pas essayer.",
            "T’es pas en retard, t’es hors course.",
            "Continue comme ça et tu sera comme de la merde",
            "Tu es pas pessimiste, tu es juste réaliste… avec un abonnement premium.",
            "Ton avenir est tellement flou que même Google Maps abandonne.",
            "Tu as enfin trouvé ta motivation… elle était en congé depuis 2012.",
            "Tu procrastines pas, tu prépares ton futur toi à gérer la pression.",
            "Ton cerveau a plusieurs onglets ouverts… aucun ne charge.",
            "Tu es pas en retard, tu es en décalage temporel.",
            "Si l’échec était un sport, tu serais champion olympique.",
            "Tu as un humour tellement sombre qu’il économise l’électricité.",
            "Ta vie est une blague… mais personne t’a expliqué la chute.",
            "Tu voulais être quelqu’un… mais c’était déjà pris.",
            "Tu es pas nul, tu es en version bêta.",
            "Ton plan A a échoué… heureusement t’avais pas de plan B.",
            "Tu as pas de problème, tu as juste des situations créatives.",
            "Ton niveau de chance ? Même les bugs t’évitent.",
            "Tu réfléchis beaucoup… mais rarement au bon moment."
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
            "Va prendre une douche",
            "Va dormir",
            "C’est pas que tu fais mal, c’est que tu fais rien.",
            "Fais confiance au chaos, il a plus d’expérience que toi.",
            "Si tu continue comme sa tu va rester où tu es",
            "Tu ne sera jamais meilleur, alors ameliore toi",
            "Au moins, tu es constant. Constamment inefficace.",
            "Respire. Voilà, tu progresses déjà plus que ce matin.",
            "Si t’as la flemme, allonge-toi encore plus.",
            "Fais une pause. De toute façon t’avais pas commencé.",
            "tu n'arrive pas à réfléchir, arrête",
            "Réfléchis moins, ça changera rien au résultat.",
            "Visualise ton succès. Maintenant retourne procrastiner.",
            "Travaille dur. Ou fais semblant, c’est déjà ça.",
            "À ce rythme-là, t’es large pour rater.",
            "Franchement, abandonner maintenant, c’est gagner du temps.",
            "Si t’as un problème, deviens le problème.",
            "Ignore tes responsabilités, elles finiront peut-être par t’oublier.",
            "Tu penses trop… mais rarement au bon moment.",
            "Ton plan A ? Déjà abandonné.",
            "Même ton réveil a perdu espoir.",
            "Tu avances… mais pas dans la bonne direction.",
            "Ton cerveau bug plus que ton PC.",
            "T’as du potentiel… mais il est en maintenance.",
            "Même tes idées prennent des jours off.",
            "Tu rates avec une régularité impressionnante.",
            "Ton avenir ? Chargement infini.",
            "Tu fais de ton mieux… et c’est déjà inquiétant.",
            "Ton organisation ? Un concept abstrait.",
            "Tu veux réussir… mais sans mise à jour.",
            "Même la chance te met en silencieux.",
            "Tu commences fort… puis tu disparais.",
            "Ton niveau ? Toujours en cours d’installation."
    );
    private static final List<String> greenAdvises = List.of(
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
            "Si tu es en retard en arrivant, dis bonjour a ton prof normalement",
            "T’as encore rien fait aujourd’hui",
            "Envoie-lui (qui?) un message",
            "Fait tes devoirs",
            "Si ça marche pas, regarde ailleurs.",
            "Plus tu fais rien, moins tu peux échouer. C’est mathématique.",
            "Arrête ton PC, c'est pire que quand tu scroll sur tiktok...",
            "Bois de l’eau. Ça résout au moins 0,3% de tes problèmes.",
            "Pourquoi tu es moche",
            "Franchement, ne change rien, sa a l'air de bien... pas marcher",
            "Si tu continues comme ça, tu vas rester exactement où tu es.",
            "T’as essayé… de faire un effort ? Juste pour voir ?",
            "Organise ton bordel. Ou pas, ça reste du bordel.",
            "Fixe-toi des objectifs. Ignore-les ensuite.",
            "Sors de ta zone de confort. Ou reste, ça a l’air cosy.",
            "Deviens la meilleure version de toi-même. Demain.",
            "Commence petit. Genre vraiment petit. Genre rien.",
            "T’as le temps… de tout repousser.",
            "T’es fatigué ? Repose-toi de ta fatigue.",
            "Pourquoi faire aujourd’hui ce que tu peux regretter demain ?",
            "Le succès, c’est surfait.",
            "T’as réussi à perdre du temps efficacement, bravo.",
            "Oublie pas de respirer"
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

    public static void generateAdvise() {

        JComboBox<String> choose = new JComboBox<>();
        choose.addItem(BadnessLevel.GREEN.getDisplayText());
        choose.addItem(BadnessLevel.ORANGE.getDisplayText());
        choose.addItem(BadnessLevel.RED.getDisplayText());

        int check = JOptionPane.showConfirmDialog(
                PotoFlux.app.getFrame(),
                choose,
                "Choisi un type de conseil",
                JOptionPane.OK_CANCEL_OPTION
        );
        if (check == JOptionPane.CANCEL_OPTION) return;

        String advise = getAdvise(BadnessLevel.getFromDisplayText(((String) choose.getSelectedItem())));
        JOptionPane.showMessageDialog(
                PotoFlux.app.getFrame(),
                advise,
                "voici un conseil",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

}