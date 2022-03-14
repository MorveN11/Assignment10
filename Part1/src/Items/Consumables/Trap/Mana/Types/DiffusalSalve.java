package Items.Consumables.Trap.Mana.Types;

import Items.Player;
import Items.Consumables.Trap.Mana.ManaTrapConsumable;

public class DiffusalSalve extends ManaTrapConsumable {
    Object player;
    public DiffusalSalve (Object player) {
        this.player = (Player) player;
        setHurt(((Player) player).getMana());
        setTrapTypeConsumable("DiffusalSalve");
    }
    public void dumb() {
        //Te quita toda la mana
    }
}
