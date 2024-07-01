package Menus;

import Battle.Battle;
import Caracters.*;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    public Game() {
//        int difficulty = selectDifficulty();
        Characters player = createCharacter();
        int rounds = selectRounds();
        listPlayerAndEnemies(player, rounds);
        int fullLife = player.getLife();
        int monsterLife = 45;
        while (rounds > 0) {
            Monsters monster = createMonster();
            new Battle(player, monster);
            if (player.getLife() > 0 && monster.getLife() < 1) {
                track();
                System.out.println("You kill an Goblin!");
                track();
                player.setXpToLevelUp(player.getXpToLevelUp() - monster.getXpDrop());
                if (player.getXpToLevelUp() <= 0) {
                    System.out.println("Level Up");
                    player.setXpToLevelUp(player.getLevel() + 1);
                    player.setLife(fullLife + 20);
                    player.setXpToLevelUp(100);
                }
            }
            rounds -= 1;
            monsterLife = monster.getLife();
        }
        track();
        if (player.getLife() > 0 && monsterLife > 0) {
            System.out.println("You escaped!");
        } else {
            System.out.println("You win!");
            track();
        }
    }

    private Monsters createMonster() {
        return new Monsters("Goblin", 45, 35, 5, 10, "Monster");
    }

    private Characters createCharacter() {
        track();
        System.out.println("Enter character name:");
        track();
        String charName =  scanner.nextLine();
        System.out.println("Select a class:");
        System.out.println("1 - Warrior \n2 - Archer \n3 - Wizard");
        track();
        int charClass = scanner.nextInt();
        boolean isValid = false;
        Characters character = null;
        while(!isValid) {
            if(charClass == 1) {
                isValid = true;
                character =  new Warrior(charName, 125, 25, 25, 10);
                character.setCharClass(1);
                character.setSkills(new Skills("Fire Sword","Fire", 35));
                character.setSkills(new Skills("Shield Stun","Stun", 0));
            }
            if (charClass == 2) {
                isValid = true;
                character =  new Archer(charName, 75, 50, 12, 10);
                character.setCharClass(2);
                character.setSkills(new Skills("Fire Arrow","Fire", 75));
                character.setSkills(new Skills("Stun Arrow","Stun", 0));
            }
            if(charClass == 3) {
                isValid = true;
                character = new Wizard(charName, 50, 5, 10, 10);
                character.setCharClass(3);
                character.setSkills(new Skills("Fireball","Fire", 100));
                character.setSkills(new Skills("Sleep","Stun", 0));
            }
            if(charClass < 1 || charClass > 3) {
                System.out.println("Invalid class");
            }
        }
        return character;
    }

    private int selectRounds() {
        track();
        System.out.println("How many rounds would you like to play?");
        track();
        return scanner.nextInt();
    }

    private int selectDifficulty() {
        boolean validOption = false;
        int difficulty = 1;
        while(!validOption) {
            System.out.println("Choose difficulty: ");
            System.out.println("1 - Easy \n2 - Medium \n3 - Hard");
            int opt = scanner.nextInt();
            if (opt >=1 && opt <= 3) {
                validOption = true;
                difficulty = opt;
            }
            if (opt < 1 || opt > 3) System.out.println("Invalid option!");
        }
        return difficulty;
    }

    private void listPlayerAndEnemies(Characters player, int enemies) {
        track();
        System.out.println("Player: " + player.getName() + " x " + enemies + " Goblins");
        track();
    }

    private void track() {
        System.out.println("--------------------------------------------------------");
    }
}
