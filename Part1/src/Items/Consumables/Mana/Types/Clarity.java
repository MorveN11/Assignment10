package Items.Consumables.Mana.Types;

import Items.Player;
import Items.Consumables.Mana.ManaConsumable;

public class Clarity extends ManaConsumable {
    Object player;
    public Clarity(Object player) {
        this.player = (Player) player;
        setCuration(150);
        setManaTypeConsumable("Clarity");
    }
    public void progressiveRestoringMana() {
        if(((Player)player).getMana() + getCuration() > ((Player)player).getMaxMana()) {
            setCuration(((Player)player).getMaxMana() - ((Player)player).getMana());
        }

        for (int i = 0; i < getCuration(); i++)
        {
            ((Player)player).setMana(((Player)player).getMana() + 1);
            System.out.println(((Player)player).getMana());
        //nos cura mana de forma progresiva
    }
    }
}
