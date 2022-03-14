package Items.Consumables.Trap;

import Items.Consumables.Consumables;

public abstract class TrapConsumable extends Consumables {
    private String trapTypeConsumable;
    public TrapConsumable() {
        setTypeConsumable("Trap");
    }

    public void CheckTypeTrapConsumable() {
        //Nos pregunta que tipo de trapConsumable instanciamos [lifetrapconsumable, manatrapconsumable]
    }

    public void setTrapTypeConsumable(String trapTypeConsumable) {
        this.trapTypeConsumable = trapTypeConsumable;
    }

    public String getTrapTypeConsumable() {
        return this.trapTypeConsumable;
    }
}
