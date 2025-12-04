package homework_10;

public class Blacksmith extends Weapon{
    Blacksmith(String name, int damage, int level){
        super(name, damage, level);
    }
//чат ГПТ
    public void upgradeWeapon(Weapon weapon){
        if (weapon.getLevel() < 10) {
            weapon.setDamage(weapon.getDamage() + 5);
            weapon.setLevel(weapon.getLevel() + 1);
            System.out.println("оружие улучшено");
        } else {
            System.out.println("оружие is already at max level!");
        }
    }

/*    Метод должен:
    увеличивать урон и уровень оружия
    но не более чем до уровня 10
    выводить сообщение, что оружие улучшено*/

}
