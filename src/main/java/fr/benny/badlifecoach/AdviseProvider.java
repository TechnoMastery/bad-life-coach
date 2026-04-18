package fr.benny.badlifecoach;

import com.google.gson.reflect.TypeToken;
import net.minheur.potoflux.PotoFlux;
import net.minheur.potoflux.logger.PtfLogger;
import net.minheur.potoflux.utils.Json;

import javax.swing.*;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class AdviseProvider {

    private static final Map<BadnessLevel, List<String>> allAdvises = new HashMap<>();

    public static void load() {

        ClassLoader cl = AdviseProvider.class.getClassLoader();

        for (BadnessLevel level : BadnessLevel.values()) {
            try (InputStream is = cl.getResourceAsStream("advises/" + level.getFileName())) {
                if (is == null) throw new IllegalStateException("Mising advises files : advises/" + level.getFileName());

                try (Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)) {
                    List<String> list =
                            Json.GSON.fromJson(reader, new TypeToken<List<String>>(){}.getType());
                    allAdvises.put(level, list);
                }
            } catch (Exception e) {
                e.printStackTrace();
                PtfLogger.error("failed to list " + level.getFileName());
            }
        }
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
