package Characters.Enemys.Knights;

import Characters.Enemys.Enemy;

public abstract class Knight extends Enemy {
    private String typeKnightEnemy;
    Object player;
    public Knight(Object player) {
        super(player);
        this.player = player;
        setTypeEnemy("Knight");
    }
    public void shield() {
        //Un caballero tiene escudo
    }
    public void setTypeKnightEnemy(String typeKnightEnemy) {
        this.typeKnightEnemy = typeKnightEnemy;
    }
    public String getTypeKnightEnemy() {
        return typeKnightEnemy;
    }
}
