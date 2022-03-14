package Characters.Hero.Types;

public class Player {
    private int life;
    private final int maxLife;
    private int mana;
    private final int maxMana;
    boolean silenceMana = false;
    public Player() {
        this.life = 100;
        this.maxLife = 1000;
        this.mana = 100;
        this.maxMana = 1000;
    }
    public void decreasingLife(int damage) {
        this.life -= damage;
        System.out.println(this.life);
    }
    public void setLife(int life) {
        this.life = life;
    }
    public int getLife() {
        return this.life;
    }
    public int getMaxLife() {
        return this.maxLife;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getMana() {
        return this.mana;
    }
    public int getMaxMana() {
        return maxMana;
    }
}
