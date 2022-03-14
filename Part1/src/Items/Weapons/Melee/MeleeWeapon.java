package Items.Weapons.Melee;

import Items.Player;
import Items.Weapons.Weapons;

public abstract class MeleeWeapon extends Weapons {
    public MeleeWeapon() {

    }
    public void push() {

    }
    public void wield() {

    }
    public void hit(Object player, int damage) {
        setDamage(damage);
        ((Player) player).decreasingLife(getDamage());
    }
    public void throwWeapon() {

    }
}
