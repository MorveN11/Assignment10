package Items.Weapons.Range;

import Items.Player;
import Items.Weapons.Weapons;

public abstract class RangeWeapon extends Weapons {
    private int bullets;
    private int maxBullets;
    public int bulletReserve;
    public RangeWeapon() {

    }
    public void reload(){
        int rest = maxBullets - bullets;
        if(bullets != maxBullets){
           if(bullets == 0){
              System.out.println("No hay balas papi");
           }else if(bulletReserve >= maxBullets){
               bullets = maxBullets;
               bulletReserve -= rest;
               System.out.println("Recargo xd");
           }else if(bullets > rest){
               bullets = maxBullets;
               bulletReserve -= rest;
               System.out.println("Recargo xd");
           }else{
               bullets += bulletReserve;
               System.out.println("Recargo xd");
           }
        }else{
            System.out.println("Tus balas ya tan al maximo papi");
          }
        }

    public void aim(){



    }
    public void setBullets(int bullets) {
        this.bullets = bullets;
    }
    public int getBullets() {
        return this.bullets;
    }
    public void shoot(Object player, int damage) {
        setDamage(damage);
        ((Player) player).decreasingLife(getDamage());
    }
    public void setMaxBullets(int maxBullets){
        this.maxBullets = maxBullets;
    }
    public int getMaxBullets(){
        return this.maxBullets;
    }
}
