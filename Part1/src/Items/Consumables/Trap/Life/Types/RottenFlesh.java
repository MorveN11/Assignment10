package Items.Consumables.Trap.Life.Types;

import Items.Player;
import Items.Consumables.Trap.Life.LifeTrapConsumable;

public class RottenFlesh extends LifeTrapConsumable {
    Object player;
    public RottenFlesh(Object player) {
        this.player = (Player) player;
        setHurt(650);
        setTrapTypeConsumable("RottenFlesh");
    }
    public void infection() {
        //Nos quita vida de manera progresiva
    }
}
