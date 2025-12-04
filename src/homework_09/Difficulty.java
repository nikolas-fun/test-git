package homework_09;

public enum Difficulty {
    EASY(0.5),
    MEDIUM(1.0),
    HARD(1.5);

    private double multiplier;

    Difficulty(double multiplier) {
        this.multiplier = multiplier;
    }

    public double calculateDamage(int baseDamage) {
        return baseDamage * multiplier;
    }
}

