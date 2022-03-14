package Items.Consumables.Life.Types;

import Items.Player;
import Items.Consumables.Life.LifeConsumable;

public class HealingSalve extends LifeConsumable {
    Object player;
    public HealingSalve(Object player) {
        this.player = (Player) player;
        setCuration(200);
        setLifeTypeConsumable("HealingSalve");
    }
    public void progressiveHealingLife() {
        //curar 200 de vida de forma progresiva al jugador
    }
}
