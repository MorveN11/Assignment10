package Items.Weapons.Melee.Hammers.Types;

import Characters.Hero.Types.Player;
import Items.Weapons.Melee.Hammers.Hammer;

public class Mjollnir extends Hammer {
    Object player;
    public Mjollnir(Object player) {
        this.player = (Player) player;
        setDamage(74);
    }
    public void throwLighting() {

    }
    public void lightingShield() {

    }
}
