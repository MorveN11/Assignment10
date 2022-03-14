package Items.Consumables.Mana.Types;

import Characters.Hero.Types.Player;
import Items.Consumables.Mana.ManaConsumable;

public class ManaFish extends ManaConsumable {
    Object player;

    public ManaFish(Object player) {
        this.player = player;
        setCuration(((Player) player).getMaxMana() - ((Player)player).getMana()); //getMaxMana nos da el valor maximo de mana que podamos tener.
        setManaTypeConsumable("ManaFish");
    }

    public void restoreMana() { //Nos restaura toda la mana.
        ((Player)player).setMana(((Player)player).getMana() + getCuration());
        System.out.println("Se restablecio toda el mana.");
    }
}
