import Menus.MainMenu;

public class Main {
    public static void main(String[] args) {
        boolean isPlaying = true;
//      just for the commit
        while (isPlaying) {
            MainMenu mainMenu = new MainMenu();
            isPlaying = mainMenu.initialMenu();
        }
    }
}