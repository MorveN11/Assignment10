package Items.Consumables.Mana.Types;

import Items.Player;
import Items.Consumables.Mana.ManaConsumable;

import java.util.Timer;
import java.util.TimerTask;

public class Clarity extends ManaConsumable {
    Object player;
    public Clarity(Object player) {
        this.player = player;
        setCuration(250);
        setManaTypeConsumable("Clarity");
    }
    public void progressiveRestoringMana() {
        Timer timer = new Timer();
        if(((Player)player).getMana() + getCuration() > ((Player)player).getMaxMana()) {
            setCuration(((Player)player).getMaxMana() - ((Player)player).getMana());
        }
        TimerTask work = new TimerTask() {
            @Override
            public void run() {
                if(getCuration() > 0) {
                    ((Player) player).setMana(((Player) player).getMana() + 1);
                    setCuration(getCuration() - 1);
                    System.out.println(((Player) player).getMana());
                }
            }
        };
        timer.schedule(work, 0, 500);
    }
}
