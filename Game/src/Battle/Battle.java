package Battle;

import Caracters.Characters;
import Caracters.Monsters;

import java.util.Scanner;

public class Battle {
    private boolean isPlayerTurn = true;

    Scanner scanner = new Scanner(System.in);

    public Battle(Characters player, Monsters monster) {
        boolean isNotRunning = true;
        boolean isEnemyStunned = false;
        int isEnemyBurning = 0;
        while (player.getLife() > 0 && monster.getLife() > 0 && isNotRunning) {
            if (isPlayerTurn) {
                int option = options();
                if (option == 1) player.attackEnemy(player, monster);
                if (option == 2) {
                    int skill = player.selectSkill(player) - 1;
                    if (skill == 0) player.useSkill(player, skill, monster);
                    if (skill == 1) isEnemyStunned = true;
                    if (player.getSkills(skill).getType().equalsIgnoreCase("Fire")) {
                        isEnemyBurning = 1;
                        player.burningDamage(monster);
                        isEnemyBurning -= 1;
                    }
                };
                if (option == 3) isNotRunning = false;
                if (option == 4) printPlayerStats(player);
                if (option == 5) System.out.println("Your enemy has: " + monster.getLife() + " Points of life");
            }
            if (isEnemyStunned) {
                setPlayerTurn();
            }
            if (!isPlayerTurn) {
                monster.attackEnemy(monster, player);
                setPlayerTurn();
            }
            System.out.println("-----------------");
            System.out.println("Player Life: " + player.getLife());
            if (monster.getLife() < 0) {
                System.out.println("Goblin Life: 0");
                System.out.println("-----------------");
            }
            else {
                System.out.println("Goblin Life: " + monster.getLife());
                System.out.println("-----------------");
            }
        }
    }


    private int options () {
        boolean validOption = false;
        int option = 1;
        while (!validOption) {
            System.out.println("Select an option: ");
            System.out.println("1 - Attack \n2 - Use Magic \n3 - Run \n4 - See your stats \n5 - See enemy life");
            int opt = scanner.nextInt();
            if (opt >= 1 && opt <= 5) {
                validOption = true;
                option = opt;
            }
            if (opt < 1 || opt > 5) {
                System.out.println("Invalid option!");
            }
        }
        setPlayerTurn();
        return option;
    }

    private void printPlayerStats(Characters player) {
        System.out.println("Name: " + player.getName());
        System.out.println("Life: " + player.getLife());
        System.out.println("Your level: " + player.getLevel());
        System.out.println("Xp to level up: " + player.getXpToLevelUp());
    }

    public boolean isPlayerTurn() {
        return isPlayerTurn;
    }

    public void setPlayerTurn() {
        isPlayerTurn = !isPlayerTurn;
    }
}
