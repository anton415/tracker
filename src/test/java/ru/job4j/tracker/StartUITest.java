package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenAddItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "Bug", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(),
                new CreateAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator() +
                        "1. Create" + System.lineSeparator() +
                        "=== Create a new Item ====" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator() +
                        "1. Create" + System.lineSeparator()
        ));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Bug");
        tracker.add(item);
        Input in = new StubInput(
                new String[] {"1", String.valueOf(item.getId()), "0"}
        );

        UserAction[] actions = {
                new ExitAction(),
                new DeleteAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator() +
                        "1. Delete Item" + System.lineSeparator() +
                        "=== Delete item ====" + System.lineSeparator() +
                        "Заявка удалена успешно." + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator() +
                        "1. Delete Item" + System.lineSeparator()
        ));
    }

    @Test
    public void whenEditItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Bug");
        tracker.add(item);
        Input in = new StubInput(
                new String[] {"1", String.valueOf(item.getId()), "New name", "0"}
        );

        UserAction[] actions = {
                new ExitAction(),
                new EditAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator() +
                        "1. Edit item" + System.lineSeparator() +
                        "=== Edit item ====" + System.lineSeparator() +
                        "Заявка изменена успешно." + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator() +
                        "1. Edit item" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByIdItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Bug");
        tracker.add(item);
        Input in = new StubInput(
                new String[] {"1", String.valueOf(item.getId()), "0"}
        );

        UserAction[] actions = {
                new ExitAction(),
                new FindByIdAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator() +
                        "1. Find by id" + System.lineSeparator() +
                        "=== Find item by id ====" + System.lineSeparator() +
                        item + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator() +
                        "1. Find by id" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByNameItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Bug");
        tracker.add(item);
        Input in = new StubInput(
                new String[] {"1", "Bug", "0"}
        );

        UserAction[] actions = {
                new ExitAction(),
                new FindByNameAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator() +
                        "1. Find by name" + System.lineSeparator() +
                        "=== Find items by name ====" + System.lineSeparator() +
                        item + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator() +
                        "1. Find by name" + System.lineSeparator()
        ));
    }

    @Test
    public void whenShowAllItems() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Bug");
        tracker.add(item);
        Input in = new StubInput(
                new String[] {"1", "0"}
        );

        UserAction[] actions = {
                new ExitAction(),
                new ShowAllAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator() +
                        "1. Show all items" + System.lineSeparator() +
                        "=== Show all items ====" + System.lineSeparator() +
                        item + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator() +
                        "1. Show all items" + System.lineSeparator()
        ));
    }
}