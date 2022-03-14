package Items.Consumables.Mana.Types;

import Items.Player;
import Items.Consumables.Mana.ManaConsumable;

import java.util.Timer;
import java.util.TimerTask;

public class EnchantedMango extends ManaConsumable {
    Object player;
    public EnchantedMango(Object player) {
        this.player = player;
        setCuration(300);
        setManaTypeConsumable("EnchantedMango");
    }
    public void momentaryRestoreMana() {
        Timer timer = new Timer();
        if(((Player)player).getMana() + getCuration() > ((Player)player).getMaxMana()) {
            setCuration(((Player)player).getMaxMana() - ((Player)player).getMana());
        }
        int previousMana = ((Player) player).getMana();
        ((Player) player).setMana(((Player) player).getMana() + getCuration());
        TimerTask work = new TimerTask() {
            @Override
            public void run() {
                if(((Player) player).getMana() > previousMana) {
                    System.out.println(((Player) player).getMana());
                    ((Player) player).setMana(((Player) player).getMana() - 1);
                }
            }
        };
        System.out.println("Tienes 5 seg de curacion");
        timer.schedule(work, 5000, 1000);
    }
}