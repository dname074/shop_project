package ui;

import io.DataPrinter;

public class UserInteface {
    public void start() {
        boolean running = true;

        while (running) {
            printMenu();
        }
    }

    private void printMenu() {
        for (MenuOption option : MenuOption.values()) {
            DataPrinter.print(option.toString());
        }
    }
}
