package Items.Consumables.Life.Types;

import Characters.Hero.Types.Player;
import Items.Consumables.Life.LifeConsumable;

import java.util.Timer;
import java.util.TimerTask;

public class PainPills extends LifeConsumable {
    Object player;

    public PainPills(Object player) {
        this.player = player;
        setCuration(300);
        setLifeTypeConsumable("PainPills");
    }

    public void painRelief() {  //Dar al player 300 de vida no de forma de permamente, por cierto tiempo.
        Timer timer = new Timer();
        if(((Player)player).getLife() + getCuration() > ((Player)player).getMaxLife()) {
            setCuration(((Player)player).getMaxLife() - ((Player)player).getLife());
        }
        int previousLife = ((Player) player).getLife();
        System.out.println(previousLife);
        ((Player) player).setLife(((Player) player).getLife() + getCuration());
        TimerTask work = new TimerTask() {
            @Override
            public void run() {
                if(((Player) player).getLife() > previousLife) {
                    System.out.println(((Player) player).getLife());
                    ((Player) player).setLife(((Player) player).getLife() - 1);
                }
            }
        };
        System.out.println("Tienes 5 seg de curacion");
        timer.schedule(work, 5000, 1000);
    }
}
