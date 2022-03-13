package Items;

public class Player {
    public int life;
    public Player() {
        this.life = 100;
    }
    public void restLife(int damage) {
        this.life -= damage;
        System.out.println(this.life);
    }
}