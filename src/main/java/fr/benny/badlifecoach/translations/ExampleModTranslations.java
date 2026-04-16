package fr.benny.badlifecoach.translations;

import net.minheur.potoflux.translations.AbstractTranslationsRegistry;
import fr.benny.badlifecoach.BadLifeCoach;

public class ExampleModTranslations extends AbstractTranslationsRegistry {
    public ExampleModTranslations() {
        super(BadLifeCoach.MOD_ID);
    }

    @Override
    protected void makeTranslation() {
        addYourTab("name")
                .en("Bad Life Coach")
                .fr("Coach de mauvaise vie");
        addYourTab("title")
                .en("Welcome to Bad Life Coach inc !")
                .fr("Bienvenu chez Coach de Mauvaise Vie !");
    }

    // tabs helper
    private TranslationBuilder addYourTab(String... children) {
        return addTab("yourTab", children);
    }
}
