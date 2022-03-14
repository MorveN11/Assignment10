package Items.Consumables.Trap.Mana.Types;

import Items.Player;
import Items.Consumables.Trap.Mana.ManaTrapConsumable;

public class MushRoom extends ManaTrapConsumable {
    Object player;
    public MushRoom (Object player) {
        this.player = (Player) player;
        setHurt(100);
        setTrapTypeConsumable("MushRoom");
    }
    public void silenceMana() {
        //Silencea al jugador por un tiempo determinado
    }
}
