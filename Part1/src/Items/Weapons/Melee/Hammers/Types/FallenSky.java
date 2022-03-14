package Items.Weapons.Melee.Hammers.Types;

import Items.Player;
import Items.Weapons.Melee.Hammers.Hammer;

public class FallenSky extends Hammer {
    Object player;
    public FallenSky(Object player) {
        this.player = (Player) player;
        setDamage(35);
    }
    public void castMeteor() {

    }
    public void blinkPlayer() {

    }
}
