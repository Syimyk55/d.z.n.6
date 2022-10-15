public class Boss extends GameEntity {
       Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "weapon=" + weapon +
                '}';
    }
}