package Items.Weapons.Range.Types;

import Characters.Hero.Types.Player;
import Items.Weapons.Range.RangeWeapon;

public class Shotgun extends RangeWeapon {
    Object player;
    public Shotgun(Object player) {
        this.player = (Player) player;
        setBullets(8);
    }
    public void pumpForearm() {

    }
    public void headShoot() {
        setDamage(1000);
        shoot(this.player, getDamage());
    }
    public void bodyShoot() {
        setDamage(500);
        shoot(this.player, getDamage());
    }
    public void armShoot() {
        setDamage(125);
        shoot(this.player, getDamage());
    }
}
