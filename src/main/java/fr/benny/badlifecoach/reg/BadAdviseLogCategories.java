package fr.benny.badlifecoach.reg;

import net.minheur.potoflux.logger.ILogCategory;

public enum BadAdviseLogCategories implements ILogCategory {
    COACH("badLifeCoach");

    public final String code;

    BadAdviseLogCategories(String code) {
        this.code = code;
    }

    @Override
    public String code() {
        return code;
    }
}
