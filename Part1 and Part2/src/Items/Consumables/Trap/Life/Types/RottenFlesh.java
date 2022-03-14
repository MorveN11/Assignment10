package Items.Consumables.Trap.Life.Types;

import Characters.Hero.Types.Player;
import Items.Consumables.Trap.Life.LifeTrapConsumable;

import java.util.Timer;
import java.util.TimerTask;

public class RottenFlesh extends LifeTrapConsumable {
    Object player;

    public RottenFlesh(Object player) {
        this.player = player;
        setHurt(650);
        setTrapTypeConsumable("RottenFlesh");
    }

    public void infection() {
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
        System.out.println("Tu estas envenenando causa, tienes 5 min para buscar un hospital");
        timer.schedule(work, 5000, 500);
    }
}

