package Items.Weapons.Range;

import Items.Player;
import Items.Weapons.Weapons;

public abstract class RangeWeapon extends Weapons {
    private int bullets;
    public RangeWeapon() {

    }
    public void reload() {

    }
    public void aim() {

    }
    public void setBullets(int bullets) {
        this.bullets = bullets;
    }
    public int getBullets(int bullets) {
        return this.bullets;
    }
    public void shoot(Object player, int damage) {
        setDamage(damage);
        ((Player) player).decreasingLife(getDamage());
    }
}
