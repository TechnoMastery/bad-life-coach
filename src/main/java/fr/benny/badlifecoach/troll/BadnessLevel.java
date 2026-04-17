package fr.benny.badlifecoach.troll;

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
}
