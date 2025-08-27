package assignment2;

import javax.swing.JOptionPane;

class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name, 10); 
    }

    @Override
    public int attack() {
        JOptionPane.showMessageDialog(null, name + " swings a mighty sword! (-10 HP)");
        return attackDamage;
    }

    @Override
    public int specialMove() {
        JOptionPane.showMessageDialog(null, name + " uses Shield Bash! (-20 HP)");
        return 20; 
}
