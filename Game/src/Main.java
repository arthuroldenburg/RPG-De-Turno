import Menus.MainMenu;

public class Main {
    public static void main(String[] args) {
        boolean isPlaying = true;

        while (isPlaying) {
            MainMenu mainMenu = new MainMenu();
            isPlaying = mainMenu.initialMenu();
        }
    }
}