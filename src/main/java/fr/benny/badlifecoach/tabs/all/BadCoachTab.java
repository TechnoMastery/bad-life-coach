package fr.benny.badlifecoach.tabs.all;

import fr.benny.badlifecoach.BadLifeAdviseHandler;
import net.minheur.potoflux.screen.tabs.BaseTab;
import net.minheur.potoflux.translations.Translations;

import javax.swing.*;
import java.awt.*;

public class BadCoachTab extends BaseTab {

    private JButton getAdviseButton;

    @Override
    protected void setPanel() {

        JLabel disclaimer1 = new JLabel("ATTENTION: ces conseils sont a prendre avec HUMOUR.");
        JLabel disclaimer2 = new JLabel("Les devs déclinent toute responsabilité en cas de problème quelconque.");

        disclaimer1.setFont(new Font("Consolas", Font.PLAIN, 15));
        disclaimer2.setFont(new Font("Consolas", Font.PLAIN, 15));
        disclaimer1.setAlignmentX(Component.CENTER_ALIGNMENT);
        disclaimer2.setAlignmentX(Component.CENTER_ALIGNMENT);

        getAdviseButton = new JButton(Translations.get("bad_life_coach:tabs.badCoach.button"));
        getAdviseButton.addActionListener(e -> BadLifeAdviseHandler.generateAdvise());
        getAdviseButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        PANEL.add(disclaimer1);
        PANEL.add(disclaimer2);
        PANEL.add(Box.createVerticalStrut(25));
        PANEL.add(getAdviseButton);
    }

    @Override
    protected String getTitle() {
        return Translations.get("bad_life_coach:tabs.badCoach.title");
    }
}
