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

    public void painRelief() {  //Dar al player 300 de vida no de forma de permamente, por cierto tiempo.
        if(((Player)player).getLife() + getCuration() > ((Player)player).getMaxLife())
        {
            setCuration(((Player)player).getMaxLife() - ((Player)player).getLife());
        }
        ((Player)player).setLife(((Player)player).getLife() + getCuration());
    }
}
