package Items.Consumables.Trap.Mana;

import Items.Consumables.Trap.TrapConsumable;

public abstract class ManaTrapConsumable extends TrapConsumable {
    private String manaTrapTypeConsumable;
    public ManaTrapConsumable() {
        setTrapTypeConsumable("Mana");
    }
    public void checkTypeManaTrapConsumable() {

    }
    public void setManaTrapTypeConsumable(String manaTrapTypeConsumable) {
        this.manaTrapTypeConsumable = manaTrapTypeConsumable;
    }
    public String getLifeTrapTypeConsumable() {
        return this.manaTrapTypeConsumable;
    }
}
