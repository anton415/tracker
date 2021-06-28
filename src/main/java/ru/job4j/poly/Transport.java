package ru.job4j.poly;

/**
 * Этот интерфейс будет определять любой вид транспорта.
 */
public interface Transport {
    /**
     * Ехать.
     */
    void drive();

    /**
     * Пассажиры.
     * @param passengers - число пассажиров.
     */
    void setPassengers(int passengers);

    /**
     * Заправить.
     * @param amountOfFuel - кол-во топлива
     * @return цена.
     */
    double refuel(int amountOfFuel);
}
