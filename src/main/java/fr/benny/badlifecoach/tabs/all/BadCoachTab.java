package fr.benny.badlifecoach.tabs.all;

import fr.benny.badlifecoach.BadLifeAdviseHandler;
import net.minheur.potoflux.screen.tabs.BaseTab;
import net.minheur.potoflux.translations.Translations;

import javax.swing.*;

public class BadCoachTab extends BaseTab {

    private JButton getAdviseButton;

    @Override
    protected void setPanel() {
        getAdviseButton = new JButton(Translations.get("bad_life_coach:tabs.badCoach.button"));
        getAdviseButton.addActionListener(e -> BadLifeAdviseHandler.generateAdvise());
        PANEL.add(getAdviseButton);
    }

    @Override
    protected String getTitle() {
        return Translations.get("bad_life_coach:tabs.badCoach.title");
    }
}
