package ru.job4j.oop;

/**
 * Батарейка.
 */
public class Battery {
    /**
     * Заряд батарейки.
     */
    private int load;

    public Battery() {
        this.load = 0;
    }

    public Battery(int load) {
        this.load = load;
    }

    /**
     * Заряжаем батарейку
     * @param load - уровень на который заряжаем батарейку.
     */
    public void charge(int load) {
        this.load += load;
    }

    /**
     * Этот метод должен списывать заряд из батареи у кого вызывали метод exchange и добавить к
     * объекту another.
     * @param another - другая батарейка.
     */
    public void exchange(Battery another) {
        another.charge(this.load);
        this.load = 0;
    }

    /**
     * Получение уровня зарядки батарейки.
     * @return уровень зарядки.
     */
    public int getLoad() {
        return load;
    }
}
