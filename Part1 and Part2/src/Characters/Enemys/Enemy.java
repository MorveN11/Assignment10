package Characters.Enemys;

import Characters.Character;
import Characters.Hero.Types.Player;

import java.util.Timer;
import java.util.TimerTask;

public abstract class Enemy extends Character {
    Timer timer = new Timer();
    boolean breakStatus = false;
    boolean silenceStatus = false;
    public boolean combatStatus = true;
    private int damage;
    private int life;
    private String typeEnemy;
    Object player;
    public Enemy(Object player) {
        this.player = player;
    }
    public abstract void passiveSkill();
    public abstract void skills();

    public void setTypeEnemy(String typeEnemy) {
        this.typeEnemy = typeEnemy;
    }
    public String getTypeEnemy() {
        return typeEnemy;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public int getLife() {
        return life;
    }
    public void enemyCombat() {
        if(checkLife()) {
            if(!combatStatus) attack();
            if(!silenceStatus) skills();
            if(!breakStatus) passiveSkill();
        }
    }
    public boolean checkLife() {
        return life > 0;
    }
    public void attack() {
        int number = (int) (Math.random() * 3);
        if (number == 2){
            System.out.println("El enemigo te daño au!");
            ((Player) player).setLife(((Player) player).getLife() - damage);
        }
        else{
            System.out.println("El enemigo fallo su ataque, ¡Que suerte!");
        }
    }
    public void stun() {
        combatStatus = true;
        silenceStatus = true;
        TimerTask work = new TimerTask() {
            @Override
            public void run() {
                combatStatus = false;
                silenceStatus = false;
            }
        };
        timer.schedule(work, 5000);
    }
    public void silence() {
        silenceStatus = true;
        TimerTask work = new TimerTask() {
            @Override
            public void run() {
                silenceStatus = false;
            }
        };
        timer.schedule(work, 5000);
    }
    public void breakEnemy() {
        breakStatus = true;
        TimerTask work = new TimerTask() {
            @Override
            public void run() {
                breakStatus = false;
            }
        };
        timer.schedule(work, 5000);
    }
    public void combat() {
        TimerTask work = new TimerTask() {
            @Override
            public void run() {
                enemyCombat();
            }
        };
        timer.schedule(work, 5000, 5000);
    }
}
