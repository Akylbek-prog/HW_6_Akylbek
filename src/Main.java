public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setName("Dark Lord");
        boss.setHealth(1000);
        boss.setDamage(150);
        boss.setWeapon(new Weapon(WeaponType.SWORD, "Shadow Blade"));
        boss.printInfo();

        System.out.println();

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setName("Bone Archer");
        skeleton1.setHealth(300);
        skeleton1.setDamage(50);
        skeleton1.setWeapon(new Weapon(WeaponType.BOW, "Bone Bow"));
        skeleton1.setArrows(10);
        skeleton1.printInfo();

        System.out.println();

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setName("Deadly Marksman");
        skeleton2.setHealth(350);
        skeleton2.setDamage(60);
        skeleton2.setWeapon(new Weapon(WeaponType.BOW, "Deadwood Bow"));
        skeleton2.setArrows(15);
        skeleton2.printInfo();
    }
}