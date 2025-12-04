package homework_09;

public class Player {
    /*1. Квест-игра — проверка уровня игрока
    Создай класс Player, где есть поле level.
    Методы:
    levelUp() — повышает уровень на 1.
    canEnterDungeon(int requiredLevel) — проверяет может ли игрок войти.
            describe() — выводит информацию о игроке:
    Игрок уровня 5. Готов к приключениям!
    Задача — правильно определить, какие методы должны возвращать значения, а какие — быть void.*/
    private int level;

    public Player(int level) {
        this.level = level;
    }

    public int getLavel() {
        return level;
    }

    public void levelUp() {
        level++;
    }

    public boolean canEnterDungeon(int requiredLevel) {
        return level >= requiredLevel;
    }
        public void describe() {
            System.out.println("Игрок уровня " + level + ". Готов к приключениям!");
        }

}
