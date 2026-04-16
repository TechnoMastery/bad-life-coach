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
                .en("Bad Life Coach")
                .fr("Coach de mauvaise vie");
        addBadCoachTab("title")
                .en("Welcome to Bad Life Coach inc !")
                .fr("Bienvenu chez Coach de Mauvaise Vie !");
        addBadCoachTab("button")
                .en("Get an advise")
                .fr("Recevoir un conseil");
    }

    // tabs helper
    private TranslationBuilder addBadCoachTab(String... children) {
        return addTab("badCoach", children);
    }
}
