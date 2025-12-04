package homework_09;

public class Main2 {
    public static void main(String[] args) {
        Player player = new Player(5);

        player.describe();

        if (player.canEnterDungeon(3)) {
            System.out.println("Можно войти в подземелье!");
        } else {
            System.out.println("Недостаточно уровня.");
        }

        TrafficLight light = TrafficLight.RED;
        System.out.println(light.getAction());

        int baseDamage = 100;
        System.out.println(Difficulty.EASY.calculateDamage(baseDamage));
}
}

