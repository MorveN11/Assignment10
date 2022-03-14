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

    public void progressiveHealingLife() { //Curar 200 de vida de forma progresiva al jugador.
        if(((Player)player).getLife() + getCuration() > ((Player)player).getMaxLife()) {
            setCuration(((Player)player).getMaxLife() - ((Player)player).getLife());
        }

        for (int i = 0; i < getCuration(); i++)
        {
            ((Player)player).setLife(((Player)player).getLife() + 1);
            System.out.println(((Player)player).getLife());
        }
    }
}
