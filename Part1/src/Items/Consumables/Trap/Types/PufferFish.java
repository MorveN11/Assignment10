package Items.Consumables.Trap.Types;

import Items.Consumables.Trap.TrapConsumable;
import Items.Player;

public class PufferFish extends TrapConsumable {
    Object player;
    public PufferFish(Object player) {
        this.player = player;
        ((Player) this.player).restLife(50);
        System.out.println("PufferFish te resto 50 de vida");
    }
}
