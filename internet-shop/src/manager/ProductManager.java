package manager;

import io.DataPrinter;

public class ProductManager {
    public void addProduct() {
        DataPrinter.print("Dodano produkt");
    }

    public void removeProduct() {
        DataPrinter.print("Usunięto produkt");
    }

    public void updateProducts() {
        DataPrinter.print("Zaktualizuj produkty");
    }

    public void showProducts() {
        DataPrinter.print("Produkty:");
    }
}
