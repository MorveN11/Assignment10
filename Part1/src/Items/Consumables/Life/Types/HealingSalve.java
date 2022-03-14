package Items.Consumables.Life.Types;

import Items.Player;
import Items.Consumables.Life.LifeConsumable;

import java.util.Timer;
import java.util.TimerTask;

public class HealingSalve extends LifeConsumable {
    Object player;

    public HealingSalve(Object player) {
        this.player = player;
        setCuration(250);
        setLifeTypeConsumable("HealingSalve");
    }

    public void progressiveHealingLife() { //Curar 200 de vida de forma progresiva al jugador.
        Timer timer = new Timer();
        if(((Player)player).getLife() + getCuration() > ((Player)player).getMaxLife()) {
            setCuration(((Player)player).getMaxLife() - ((Player)player).getLife());
        }
        TimerTask work = new TimerTask() {
            @Override
            public void run() {
                if(getCuration() > 0) {
                    ((Player) player).setLife(((Player) player).getLife() + 1);
                    setCuration(getCuration() - 1);
                    System.out.println(((Player) player).getLife());
                }
            }
        };
        timer.schedule(work, 0, 200);
        }
}
