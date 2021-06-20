package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        // Перемещение элемента в конец
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        // Удаление последнего элемента
        products[products.length - 1] = null;
        return products;
    }
}
