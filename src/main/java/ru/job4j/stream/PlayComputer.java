package ru.job4j.stream;

public class PlayComputer {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .buildColor("silver metallic")
                .buildVideoCard("GeForce RTX 3060")
                .buildProcessor("Intel® CoreTM i5")
                .buildMotherBoard("GAMING")
                .buildRam("16 ГБ")
                .build();
        System.out.println(computer);
    }
}
