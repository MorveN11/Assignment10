package Items.Weapons.Melee.Hammers.Types;

import Items.Player;
import Items.Weapons.Melee.Hammers.Hammer;

public class SkullBasher extends Hammer {
    Object player;
    public SkullBasher(Object player) {
        this.player = (Player) player;
        setDamage(25);
    }
    public void bashEnemy() {

    }
    public void ignoreImmunity() {

    }
}
