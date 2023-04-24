import weapon.*;

import java.util.Scanner;


public class Player {
    private Weapon[] weaponSlots;
    public Player() {
        weaponSlots = new Weapon[] {
                new Gun(),
                new WaterGun(),
                new Rpg(),
                new Automat(),
                new Slingshot()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > weaponSlots.length || slot < 1) {
            System.out.println("Оружия нет");
        }else {
        Weapon weapon = weaponSlots[slot-1];
        // Огонь!
        weapon.shot();
    }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;
while(true) {
    slot = scanner.nextInt();
    if (slot == -1) {
        break;
    }
    player.shotWithWeapon(slot);
    // TODO главный цикл игры:
    // запрашивать номер с клавиатуры
    // с помощью scanner.nextInt(),
    // пока не будет введено -1

}
        System.out.println("Game over!");
    }
}