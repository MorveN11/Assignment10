package Items.Consumables.Mana;

import Items.Consumables.Consumables;

public abstract class ManaConsumable extends Consumables {
    private String manaTypeConsumable;
    public ManaConsumable() {
        setTypeConsumable("Mana");
    }
    public void checkTypeManaConsumable() {
        //Chekea que tipo de manaConsumable se instancia [Clarity, EnchantedMango, ManaFish]
    }

    public void setManaTypeConsumable(String manaTypeConsumable) {
        this.manaTypeConsumable = manaTypeConsumable;
    }

    public String getManaTypeConsumable() {
        return this.manaTypeConsumable;
    }

}
