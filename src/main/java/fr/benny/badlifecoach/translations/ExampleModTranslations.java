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
                .en("Your tab name");
        addYourTab("title")
                .en("Your tab title");
    }

    // tabs helper
    private TranslationBuilder addYourTab(String... children) {
        return addTab("yourTab", children);
    }
}
