package Items.Consumables.Trap.Life.Types;

import Items.Player;
import Items.Consumables.Trap.Life.LifeTrapConsumable;

public class PufferFish extends LifeTrapConsumable {
    Object player;
    public PufferFish(Object player) {
        this.player = (Player) player;
        setHurt(600);
        setTrapTypeConsumable("PufferFish");
    }
    public void poison() {
        //Nos quita vida de forma progresiva
    }
}