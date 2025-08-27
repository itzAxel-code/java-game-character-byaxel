package assignment2;

import javax.swing.JOptionPane;

abstract class GameCharacter {
    String name;
    int hp;
    int attackDamage;

    public GameCharacter(String name, int attackDamage) {
        this.name = name;
        this.hp = 100; 
        this.attackDamage = attackDamage;
    }

    public abstract int attack();
    public abstract int specialMove();

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void showStatus() {
        JOptionPane.showMessageDialog(null,
            name + " HP: " + hp);
    }
}
