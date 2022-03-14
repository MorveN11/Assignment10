package Items.Weapons.Melee.Knifes.Types;

import Items.Player;
import Items.Weapons.Melee.Knifes.Knife;

public class AbyssalBlade extends Knife {
    Object player;
    public AbyssalBlade(Object player) {
        this.player = (Player) player;
        setDamage(25);
    }
    public void bashEnemy() {

    }
    public void ignoreImmunity() {

    }
}
