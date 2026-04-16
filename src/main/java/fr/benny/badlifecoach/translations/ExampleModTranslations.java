package fr.benny.badlifecoach.translations;

import net.minheur.potoflux.translations.AbstractTranslationsRegistry;
import fr.benny.badlifecoach.BadLifeCoach;

public class ExampleModTranslations extends AbstractTranslationsRegistry {
    public ExampleModTranslations() {
        super(BadLifeCoach.MOD_ID);
    }

    @Override
    protected void makeTranslation() {
        addBadCoachTab("name")
                .fr("Bad Life Coach");
        addBadCoachTab("title")
                .fr("Bienvenu chez Bad Life Coach (inc.) !");
        addBadCoachTab("button")
                .fr("Recevoir un conseil");
    }

    // tabs helper
    private TranslationBuilder addBadCoachTab(String... children) {
        return addTab("badCoach", children);
    }
}
