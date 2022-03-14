package Items.Weapons.Range.Types;

import Items.Player;
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

    }
    public void bodyShoot() {

    }
    public void armShoot() {

    }
}
