package assignment2;

import javax.swing.JOptionPane;

class Mage extends GameCharacter {
    public Mage(String name) {
        super(name, 15); 
    }

    @Override
    public int attack() {
        JOptionPane.showMessageDialog(null, name + " casts a fireball! (-15 HP)");
        return attackDamage;
    }

    @Override
    public int specialMove() {
        JOptionPane.showMessageDialog(null, name + " uses Lightning Storm! (-25 HP)");
        return 25;
        
    }
}
