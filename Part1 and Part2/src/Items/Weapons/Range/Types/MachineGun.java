package Items.Weapons.Range.Types;

import Characters.Hero.Types.Player;
import Items.Weapons.Range.RangeWeapon;

public class MachineGun extends RangeWeapon {
    Object player;
    public MachineGun(Object player) {
        this.player = (Player) player;
        setBullets(30);
    }
    public void setMode() {

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
