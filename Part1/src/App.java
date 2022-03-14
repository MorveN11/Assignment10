import Items.Consumables.Trap.Life.Types.PufferFish;
import Items.Consumables.Trap.Mana.Types.TrollPotion;
import Items.Player;

public class App {
    public static void main(String[] args) {
        Player player = new Player();
        PufferFish eat = new PufferFish(player);
        TrollPotion eat2 = new TrollPotion(player);
    }
}
