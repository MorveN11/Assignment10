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
    public void lifeDrain() { //Nos quita vida de forma progresiva
        if(((Player)player).getLife() - getHurt() <= ((Player)player).getMana()) {
            setHurt(((Player)player).getLife() - 1);
        }

        for (int i = 0; i < getHurt(); i++)
        {
            ((Player)player).setLife(((Player)player).getLife() - 1);
            System.out.println(((Player)player).getLife());
        }
    }
    }

