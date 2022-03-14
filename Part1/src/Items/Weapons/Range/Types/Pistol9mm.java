package Items.Weapons.Range.Types;

import Items.Player;
import Items.Weapons.Range.RangeWeapon;

public class Pistol9mm extends RangeWeapon {
    Object player;
    public Pistol9mm(Object player) {
        this.player = (Player) player;
        setBullets(12);
    }
    public void wieldBothHands(){


    }
    public void headShoot() {
        setDamage(20);
        shoot(this.player, getDamage());
    }
    public void bodyShoot() {
        setDamage(10);
        shoot(this.player, getDamage());
    }
    public void armShoot() {
        setDamage(5);
        shoot(this.player, getDamage());
    }
}
