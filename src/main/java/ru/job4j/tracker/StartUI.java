package ru.job4j.tracker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StartUI {
    public static final Pattern PATTERN_FOR_MENU = Pattern.compile("[0-6]");
    public static final Pattern PATTERN_FOR_ID = Pattern.compile("^\\d+$");

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            String selectedMenu = scanner.nextLine();
            if (isMenuSelectCorrect(selectedMenu)) {
                int select = Integer.parseInt(selectedMenu);
                System.out.println("Пользователь выбрал: " + select);
                if (select == 0) {
                    addNewItem(scanner, tracker);
                } else if (select == 1) {
                    showAllItems(tracker);
                } else if (select == 2) {
                    editItem(scanner, tracker);
                } else if (select == 3) {
                    deleteItem(scanner, tracker);
                } else if (select == 4) {
                    findItemById(scanner, tracker);
                } else if (select == 5) {
                    findItemByName(scanner, tracker);
                } else if (select == 6) {
                    run = false;
                }
            } else {
                System.out.println("Error 404. Menu not found!");
            }

        }
    }

    private void findItemByName(Scanner scanner, Tracker tracker) {
        System.out.print("Enter id: ");
        String name = scanner.nextLine();
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Error 404. Items not found!");
        }
    }

    private void findItemById(Scanner scanner, Tracker tracker) {
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        if (isIdEnterCorrect(id)) {
            Item item = tracker.findById(Integer.parseInt(id));
            System.out.println(item);
        } else {
            System.out.println("Error 404. Id not found!");
        }
    }

    private void deleteItem(Scanner scanner, Tracker tracker) {
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        if (isIdEnterCorrect(id)) {
            tracker.delete(Integer.parseInt(id));
        } else {
            System.out.println("Error 404. Id not found!");
        }

    }

    private void editItem(Scanner scanner, Tracker tracker) {
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        if (isIdEnterCorrect(id)) {
            Item item = tracker.findById(Integer.parseInt(id));
            if (item != null) {
                System.out.println(item);
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                tracker.replace(Integer.parseInt(id), new Item(name));
            } else {
                System.out.println("Error 404. Item not found!");
            }
        } else {
            System.out.println("Error 404. Id not found!");
        }

    }

    private void showAllItems(Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
    }

    private void addNewItem(Scanner scanner, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    private boolean isMenuSelectCorrect(String id) {
        return id != null && PATTERN_FOR_MENU.matcher(id).matches();
    }

    private boolean isIdEnterCorrect(String id) {
        return id != null && PATTERN_FOR_ID.matcher(id).matches();
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
