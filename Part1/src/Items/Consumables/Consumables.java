package Items.Consumables;

import Items.Item;

public abstract class Consumables extends Item {
    private int mount;
    private int curation;
    private int hurt;
    private String typeConsumable;
    public Consumables() {

    }
    public void setTypeConsumable(String typeConsumable) { this.typeConsumable = typeConsumable; }
    public String getTypeConsumable() { return this.typeConsumable; }
    public void setMount(int mount) { this.mount = mount; }
    public int getMount() { return this.mount; }
    public void setCuration(int mount) { this.curation = mount; }
    public int getCuration() { return this.curation; }
    public void setHurt(int hurt) { this.hurt = hurt; }
    public int getHurt() { return this.hurt; }

    public void checkMount() {

    }
    public void checkTypeConsumable() {

    }
    @Override
    public void useItem() {

    }
}
