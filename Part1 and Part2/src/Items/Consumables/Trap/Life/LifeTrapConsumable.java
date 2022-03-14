package Items.Consumables.Trap.Life;

import Items.Consumables.Trap.TrapConsumable;

public abstract class LifeTrapConsumable extends TrapConsumable {
    private String lifeTrapTypeConsumable;
    public LifeTrapConsumable() {
        setTrapTypeConsumable("Life");
    }
    public void checkTypeLifeTrapConsumable() {
        //Nos pregunta que tipo de lifetrapconsumable estamos instanciando [corruptedMilk, pufferFish, rottenFlesh]
    }
    public void setLifeTrapTypeConsumable(String lifeTrapTypeConsumable) {
        this.lifeTrapTypeConsumable = lifeTrapTypeConsumable;
    }
    public String getLifeTrapTypeConsumable() {
        return this.lifeTrapTypeConsumable;
    }
}
