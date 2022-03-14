package Items.Consumables.Life.Types;

import Items.Player;
import Items.Consumables.Life.LifeConsumable;

public class PainPills extends LifeConsumable {
    Object player;
    public PainPills(Object player) {
        this.player = (Player) player;
        setCuration(300);
        setLifeTypeConsumable("PainPills");
    }
    public void painRelief() {
        //dar al player 300 de vida no de forma de permamente, por cierto tiempo
    }
}
