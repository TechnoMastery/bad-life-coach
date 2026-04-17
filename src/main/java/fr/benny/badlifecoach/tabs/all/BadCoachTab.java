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

        JLabel disclaimer = new JLabel("ATTENTION: ces conseils sont a prendre avec HUMOUR.\nLes devs déclinent toute responsabilité en cas de problème quelconque.");
        disclaimer.setFont(new Font("Consolas", Font.PLAIN, 15));

        getAdviseButton = new JButton(Translations.get("bad_life_coach:tabs.badCoach.button"));
        getAdviseButton.addActionListener(e -> BadLifeAdviseHandler.generateAdvise());

        PANEL.add(disclaimer);
        PANEL.add(Box.createVerticalStrut(25));
        PANEL.add(getAdviseButton);
    }

    @Override
    protected String getTitle() {
        return Translations.get("bad_life_coach:tabs.badCoach.title");
    }
}
