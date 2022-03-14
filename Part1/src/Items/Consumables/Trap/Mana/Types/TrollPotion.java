package Items.Consumables.Trap.Mana.Types;

import Items.Player;
import Items.Consumables.Trap.Mana.ManaTrapConsumable;

public class TrollPotion extends ManaTrapConsumable {
    Object player;
    public TrollPotion (Object player) {
        this.player = (Player) player;
        int random = (int) (Math.random() * 1000);
        setHurt(random);
        setTrapTypeConsumable("TrollPotion");
    }

    public void trolled() {

    }
}
