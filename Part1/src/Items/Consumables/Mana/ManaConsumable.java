package Items.Consumables.Mana;

import Items.Consumables.Consumables;

public abstract class ManaConsumable extends Consumables {
    private String manaTypeConsumable;
    public ManaConsumable() {
        setTypeConsumable("Mana");
    }
    public void checkTypeManaConsumable() {

    }

    public void setManaTypeConsumable(String manaTypeConsumable) {
        this.manaTypeConsumable = manaTypeConsumable;
    }

    public String getManaTypeConsumable() {
        return this.manaTypeConsumable;
    }

}
