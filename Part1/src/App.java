import Items.Consumables.Trap.Types.PufferFish;
import Items.Player;

public class App {
    public static void main(String[] args) {
        Player player = new Player();
        PufferFish eat = new PufferFish(player);
        System.out.println(eat.test);
    }
}
