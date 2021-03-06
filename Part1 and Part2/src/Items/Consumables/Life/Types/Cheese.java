package Items.Consumables.Life.Types;

import Characters.Hero.Types.Player;
import Items.Consumables.Life.LifeConsumable;

public class Cheese extends LifeConsumable {
    Object player;

    public Cheese(Object player) {
        this.player = player;
        setCuration(((Player)player).getMaxLife() - ((Player) player).getLife());
        setLifeTypeConsumable("Cheese");
    }

    public void healingLife() { //Nos restaura toda la vida de manera instantanea.
        ((Player)player).setLife(((Player)player).getLife() + getCuration());
        System.out.println("Se restablecio toda la vida.");
    }
}
