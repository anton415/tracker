package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Поехали!");
    }

    @Override
    public void setPassengers(int passengers) {
        System.out.println("Автобус заполнен " + passengers + " пассажирами.");
    }

    @Override
    public double refuel(int amountOfFuel) {
        System.out.println("Заправились на " + amountOfFuel + " топлива.");
        int price = amountOfFuel * 45;
        System.out.println("Стоимость: " + price);
        return price;
    }
}
