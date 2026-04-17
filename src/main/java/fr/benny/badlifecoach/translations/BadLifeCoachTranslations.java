package fr.benny.badlifecoach.translations;

import net.minheur.potoflux.translations.AbstractTranslationsRegistry;
import fr.benny.badlifecoach.BadLifeCoach;

public class BadLifeCoachTranslations extends AbstractTranslationsRegistry {
    public BadLifeCoachTranslations() {
        super(BadLifeCoach.MOD_ID);
    }

    @Override
    protected void makeTranslation() {
        addBadCoachTab("name")
                .en("Bad Life Coach");
        addBadCoachTab("title")
                .en("Bienvenu chez Bad Life Coach (inc.) !");
        addBadCoachTab("button")
                .en("Recevoir un conseil");
    }

    // tabs helper
    private TranslationBuilder addBadCoachTab(String... children) {
        return addTab("badCoach", children);
    }
}
