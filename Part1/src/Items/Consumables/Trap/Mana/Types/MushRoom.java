package Items.Consumables.Trap.Mana.Types;

import Items.Player;
import Items.Consumables.Trap.Mana.ManaTrapConsumable;

import java.util.Timer;
import java.util.TimerTask;

public class MushRoom extends ManaTrapConsumable {
    Object player;
    public MushRoom (Object player) {
        this.player = (Player) player;
        setTrapTypeConsumable("MushRoom");
    }
    public void silenceMana() {
        Timer timer = new Timer();
        int previousMana = ((Player) player).getMana();
        System.out.println("Tu mana será 1 por 10 segundos cuidado");
        ((Player) player).setMana(1);
        TimerTask work = new TimerTask() {
            @Override
            public void run() {
                ((Player) player).setMana(previousMana);
                System.out.println(((Player) player).getMana());
            }
        };
        System.out.println(((Player) player).getMana());
        timer.schedule(work, 10000);
    }
}
