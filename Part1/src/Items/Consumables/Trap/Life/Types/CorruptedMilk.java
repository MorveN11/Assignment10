package Items.Consumables.Trap.Life.Types;

import Items.Player;
import Items.Consumables.Trap.Life.LifeTrapConsumable;

public class CorruptedMilk extends LifeTrapConsumable {
    Object player;
    public CorruptedMilk(Object player) {
        this.player = (Player) player;
        setHurt(500);
        setLifeTrapTypeConsumable("CorruptedMilk");
    }
    public void lifeDrain() {

    }
}
