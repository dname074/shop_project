package ui;

import io.DataPrinter;
import io.DataReader;
import manager.ProductManager;

public class UserInteface {
    private final ProductManager manager = new ProductManager();

    public void start() {
        boolean running = true;

        while (running) {
            DataPrinter.print("Witamy w naszym sklepie");

            printMenu();
            try {
                running = chooseOption(running);
            } catch (IllegalArgumentException e) {
                DataPrinter.print(e.getMessage());
            }
        }
    }

    private boolean chooseOption(boolean running) throws IllegalArgumentException {
        MenuOption option = MenuOption.getOptionFromInt(DataReader.getIntFromUser());

        switch(option) {
            case SHOW_PRODUCTS -> manager.showProducts();
            case ADD_TO_CART -> manager.addProduct();
            case REMOVE_FROM_CART -> manager.removeProduct();
            case PLACE_AN_ORDER -> DataPrinter.print("Funkcjonalnosc wkrotce");
            case EXIT -> running = false;
            default -> throw new IllegalArgumentException("Wybrano niepoprawną opcję");
        }
        return running;
    }

    private void printMenu() {
        for (MenuOption option : MenuOption.values()) {
            DataPrinter.print(option.toString());
        }
    }
}
