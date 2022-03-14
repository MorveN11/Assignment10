package Items.Consumables.Trap.Life.Types;

import Characters.Hero.Types.Player;
import Items.Consumables.Trap.Life.LifeTrapConsumable;

import java.util.Timer;
import java.util.TimerTask;

public class CorruptedMilk extends LifeTrapConsumable {
    Object player;
    public CorruptedMilk(Object player) {
        this.player = player;
        setHurt(500);
        setLifeTrapTypeConsumable("CorruptedMilk");
    }
    public void lifeDrain() { //Nos quita vida de forma progresiva
        Timer timer = new Timer();
        if (((Player) player).getLife() - getHurt() <= 1) {
            setHurt(((Player) player).getLife() - 1);
        }
        System.out.println(getHurt());
        TimerTask work = new TimerTask() {
            @Override
            public void run() {
                if (getHurt() > 0) {
                    ((Player) player).setLife(((Player) player).getLife() - 1);
                    setHurt(getHurt() - 1);
                    System.out.println(((Player) player).getLife());
                }
            }
        };
        System.out.println("Esa cosa no era leche mano, te estas envenenando!");
        timer.schedule(work, 5000, 500);
    }
}

