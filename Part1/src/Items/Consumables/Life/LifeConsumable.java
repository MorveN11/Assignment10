package Items.Consumables.Life;

import Items.Consumables.Consumables;

public abstract class LifeConsumable extends Consumables {
    private String lifeTypeConsumable;
    public LifeConsumable() {
        setTypeConsumable("Life");
    }
    public void checkTypeLifeConsumable() {

    }

    public void setLifeTypeConsumable(String lifeTypeConsumable) {
        this.lifeTypeConsumable = lifeTypeConsumable;
    }

    public String getLifeTypeConsumable() {
        return this.lifeTypeConsumable;
    }
}
