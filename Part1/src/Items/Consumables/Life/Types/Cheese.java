package Items.Consumables.Life.Types;

import Items.Player;
import Items.Consumables.Life.LifeConsumable;

public class Cheese extends LifeConsumable {
    Object player;
    public Cheese(Object player) {
        this.player = (Player) player;
        setCuration(((Player) player).getMaxLife());
        setLifeTypeConsumable("Cheese");
    }
    public void healingLife() {

    }
}
