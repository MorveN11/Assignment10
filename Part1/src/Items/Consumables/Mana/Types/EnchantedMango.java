package Items.Consumables.Mana.Types;

import Items.Player;
import Items.Consumables.Mana.ManaConsumable;

public class EnchantedMango extends ManaConsumable {
    Object player;
    public EnchantedMango(Object player) {
        this.player = (Player) player;
        setCuration(300);
        setManaTypeConsumable("EnchantedMango");
    }
    public void momentaryRestoreMana() {

    }
}
