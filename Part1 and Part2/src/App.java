import Items.Consumables.Trap.Mana.Types.TrollPotion;
import Characters.Hero.Types.Player;

public class App {
    public static void main(String[] args) {
        Player player = new Player();
        TrollPotion potion = new TrollPotion(player);
        potion.trolled();

    }
}
