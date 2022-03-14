package Characters.Enemys.Wizards;

import Characters.Enemys.Enemy;

public abstract class Wizard extends Enemy {
    private String typeWizardEnemy;
    Object player;

    public Wizard(Object player) {
        super(player);
        this.player = player;
        setTypeEnemy("Wizard");
    }
    public void magicResistance() {
        //Un mago tiene mejor defensa magica
    }
    public void setTypeWizardEnemy(String typeWizardEnemy) {
        this.typeWizardEnemy = typeWizardEnemy;
    }
    public String getTypeWizardEnemy() {
        return typeWizardEnemy;
    }
}
