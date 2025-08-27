package assignment2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String mageName = JOptionPane.showInputDialog("Enter Mage's name:");
        String warriorName = JOptionPane.showInputDialog("Enter Warrior's name:");

        GameCharacter mage = new Mage(mageName);
        GameCharacter warrior = new Warrior(warriorName);

        JOptionPane.showMessageDialog(null, "⚔️ Battle Start! " + mage.name + " vs " + warrior.name + "\nBoth start with 100 HP!");

        while (mage.isAlive() && warrior.isAlive()) {
            String mageChoice = JOptionPane.showInputDialog(
                mage.name + "'s turn! Choose move:\n1. Attack\n2. Special Move");
            int mageDamage = 0;
            if ("1".equals(mageChoice)) {
                mageDamage = mage.attack();
            } else if ("2".equals(mageChoice)) {
                mageDamage = mage.specialMove();
            }
            warrior.takeDamage(mageDamage);

            if (!warrior.isAlive()) break;

            String warriorChoice = JOptionPane.showInputDialog(
                warrior.name + "'s turn! Choose move:\n1. Attack\n2. Special Move");
            int warriorDamage = 0;
            if ("1".equals(warriorChoice)) {
                warriorDamage = warrior.attack();
            } else if ("2".equals(warriorChoice)) {
                warriorDamage = warrior.specialMove();
            }
            mage.takeDamage(warriorDamage);

            JOptionPane.showMessageDialog(null,
                mage.name + " HP: " + mage.hp + "\n" +
                warrior.name + " HP: " + warrior.hp);
        }

        String winner = mage.isAlive() ? mage.name : warrior.name;
        JOptionPane.showMessageDialog(null, "CONGRATS!!! " + winner + " wins the battle!");
    }
}
