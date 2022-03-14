import Items.Consumables.Life.Types.HealingSalve;
import Items.Consumables.Trap.Life.Types.PufferFish;
import Items.Consumables.Trap.Mana.Types.TrollPotion;
import Items.Player;

public class App {
    public static void main(String[] args) {
        Player player = new Player();
        HealingSalve cura1 = new HealingSalve(player);
        cura1.progressiveHealingLife();

    }
}
