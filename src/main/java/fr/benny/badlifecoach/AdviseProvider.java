package fr.benny.badlifecoach;

import net.minheur.potoflux.PotoFlux;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class AdviseProvider {

    private static final Map<BadnessLevel, List<String>> allAdvises = new HashMap<>();

    public static void load() {
        // TODO: load
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
