package Items.Consumables.Mana.Types;

import Items.Player;
import Items.Consumables.Mana.ManaConsumable;

public class ManaFish extends ManaConsumable {
    Object player;
    public ManaFish(Object player) {
        this.player = (Player) player;
        setCuration(((Player) player).getMaxMana()); //getMaxMana nos da el valor maximo de mana que podamos tener
        setManaTypeConsumable("ManaFish");
    }
    public void restoreMana() {
        //Nos restaura toda la mana
    }
}
