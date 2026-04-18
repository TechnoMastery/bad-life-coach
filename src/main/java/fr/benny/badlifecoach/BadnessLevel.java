package fr.benny.badlifecoach;

public enum BadnessLevel {
    GREEN("vert"),
    ORANGE("orange"),
    RED("rouge");

    private final String displayText;

    BadnessLevel(String displayText) {
        this.displayText = displayText;
    }

    public String getDisplayText() {
        return displayText;
    }

    public static BadnessLevel getFromDisplayText(String displayText) {
        for (BadnessLevel level : BadnessLevel.values()) {
            if (level.displayText.equals(displayText)) return level;
        }
        return null;
    }
}
