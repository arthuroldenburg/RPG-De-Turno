package Menus;

import Caracters.Characters;

import java.util.Scanner;

public class MainMenu {
//    protected int difficulty;

    Scanner scanner = new Scanner(System.in);

    public boolean initialMenu() {
        greetings();
        if (optionSelector()) {
            return false;
        }
        new Game();
//        selectDifficulty();
        return true;
    }

    private void greetings() {
        System.out.println("-----------------------------\n");
        System.out.println("Welcome to the RPG Terminal\n");
        System.out.println("-----------------------------\n");
    }

    private boolean optionSelector() {
        System.out.println("Please select an option:\n");
        System.out.println("1 - Start \n2 - Exit");
        if (scanner.nextInt() == 2) {
            System.out.println("Thanks for playing");
            return true;
        }
        return false;
    }

//    private void selectDifficulty() {
//        System.out.println("Now, Select the difficulty:");
//        System.out.println("1 - Easy \n2 - Medium \n3 - Hard");
//        this.setDifficulty(scanner.nextInt());
//    }
//
//    public int getDifficulty() {
//        return difficulty;
//    }
//
//    public void setDifficulty(int difficulty) {
//        this.difficulty = difficulty;
//    }
}
