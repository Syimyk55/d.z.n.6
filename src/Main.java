public class Main {

    public static void main(String[] args) {
        Boss boss= new Boss(600,50, new Weapon());
        System.out.println("Weapon: " + boss.getWeapon());
        System.out.println( "Health: " + boss.getHealth() + " Demage; " + boss.getDamage());

    }



}