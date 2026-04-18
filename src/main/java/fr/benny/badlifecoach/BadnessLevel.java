package fr.benny.badlifecoach;

public enum BadnessLevel {
    GREEN("vert", "green_advises.json"),
    ORANGE("orange", "orange_advises.json"),
    RED("rouge", "red_advises.json");

    private final String displayText;
    private final String fileName;

    BadnessLevel(String displayText, String fileName) {
        this.displayText = displayText;
        this.fileName = fileName;
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

    public String getFileName() {
        return fileName;
    }
}
