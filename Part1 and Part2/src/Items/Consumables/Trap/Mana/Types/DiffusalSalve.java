package Items.Consumables.Trap.Mana.Types;

import Characters.Hero.Types.Player;
import Items.Consumables.Trap.Mana.ManaTrapConsumable;

public class DiffusalSalve extends ManaTrapConsumable {
    Object player;

    public DiffusalSalve (Object player) {
        this.player = player;
        setHurt(((Player) player).getMana() - 1);
        setTrapTypeConsumable("DiffusalSalve");
    }
    public void dumb() { //Te quita todo el mana.
        ((Player)player).setMana(((Player)player).getMana() - getHurt());
        System.out.println("Te quedaste sin Mana");
    }
}
