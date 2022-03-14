package Characters.Enemys.Wizards.Types;

import Characters.Enemys.Knights.Knight;
import Characters.Enemys.Wizards.Wizard;

public class ChaosWitch extends Wizard {
    Object player;
    public ChaosWitch(Object player) {
        super(player);
        this.player = player;
        setTypeWizardEnemy("ChaosWitch");
        setLife(400);
        setDamage(50);
    }
    @Override
    public void passiveSkill() {
        //Habilidades pasivas
    }

    @Override
    public void skills() {
        //Habilidades
    }
}