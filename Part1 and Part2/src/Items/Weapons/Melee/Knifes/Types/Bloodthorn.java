package Items.Weapons.Melee.Knifes.Types;

import Characters.Hero.Types.Player;
import Items.Weapons.Melee.Knifes.Knife;

public class Bloodthorn extends Knife {
    Object player;
    public Bloodthorn(Object player) {
        this.player = (Player) player;
        setDamage(50);
    }
    public void silence() {

    }
    public void amplifyDamage() {

    }
}
