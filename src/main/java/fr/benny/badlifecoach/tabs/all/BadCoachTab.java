package fr.benny.badlifecoach.tabs.all;

import net.minheur.potoflux.screen.tabs.BaseTab;
import net.minheur.potoflux.translations.Translations;

public class BadCoachTab extends BaseTab {
    @Override
    protected void setPanel() {
        // add here content
    }

    @Override
    protected String getTitle() {
        return Translations.get("bad_life_coach:tabs.yourTab.title");
    }
}
