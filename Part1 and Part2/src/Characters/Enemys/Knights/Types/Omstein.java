package Characters.Enemys.Knights.Types;

import Characters.Enemys.Knights.Knight;

public class Omstein extends Knight {
    Object player;
    public Omstein(Object player) {
        super(player);
        this.player = player;
        setTypeKnightEnemy("Omstein");
        setLife(500);
        setDamage(40);
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
