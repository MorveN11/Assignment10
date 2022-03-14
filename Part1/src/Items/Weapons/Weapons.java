package Items.Weapons;

import Items.Item;

public abstract class Weapons extends Item {
    private int damage;
    public Weapons() {

    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDamage() {
        return this.damage;
    }
    public void upgradeWeapon() {

    }
    @Override
    public void useItem() {

    }

}
