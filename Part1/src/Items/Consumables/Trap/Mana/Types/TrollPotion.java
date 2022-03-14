package Items.Consumables.Trap.Mana.Types;

import Items.Player;
import Items.Consumables.Trap.Mana.ManaTrapConsumable;

public class TrollPotion extends ManaTrapConsumable {
    Object player;
    public TrollPotion (Object player) {
        this.player = (Player) player;
        int random = (int) (Math.random() * 1000);
        setHurt(random);
        setTrapTypeConsumable("TrollPotion");
    }

    public void trolled() { //Quitamos de manera randomica un numero determinado de Mana
        if(((Player)player).getMana() - getHurt() <= ((Player)player).getMana()) {
            setHurt(((Player)player).getMana() - 1);
        }
        ((Player)player).setMana(((Player)player).getMana() - getHurt());

    }
}
