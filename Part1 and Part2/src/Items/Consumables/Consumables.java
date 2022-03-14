package Items.Consumables;

import Items.Item;

public abstract class Consumables extends Item {
    private int amount;  //Cantidad de consumibles
    private int curation; //Cantidad de curacion
    private int hurt;  //Cantidad de daño recibido
    private String typeConsumable; //Tipo de consumible [life, mana, trap]
    public Consumables() {

    }
    public void setTypeConsumable(String typeConsumable) { this.typeConsumable = typeConsumable; }
    public String getTypeConsumable() { return this.typeConsumable; }
    public void setAmount(int amount) { this.amount = amount; }
    public int getAmount() { return this.amount; }
    public void setCuration(int curation) { this.curation = curation; }
    public int getCuration() { return this.curation; }
    public void setHurt(int hurt) { this.hurt = hurt; }
    public int getHurt() { return this.hurt; }

    public void checkMount() {
        //Preguntamos si tenemos en el inventario consumibles
    }
    public void checkTypeConsumable() {
        //Que tipo de consumible instanciamos
    }
    @Override
    public void useItem() {
        //Usamos el consumible
    }
}
