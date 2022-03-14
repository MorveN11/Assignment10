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

    }
}
