package ru.job4j.stream;

public class ComputerBuilder {
    private String color;
    private String videoCard;
    private String processor;
    private String motherBoard;
    private String ram;

    ComputerBuilder buildColor(String color) {
        this.color = color;
        return this;
    }

    ComputerBuilder buildVideoCard(String videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    ComputerBuilder buildProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    ComputerBuilder buildMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
        return this;
    }

    ComputerBuilder buildRam(String ram) {
        this.ram = ram;
        return this;
    }

    Computer build() {
        Computer computer = new Computer();
        computer.setColor(color);
        computer.setVideoCard(videoCard);
        computer.setProcessor(processor);
        computer.setMotherBoard(motherBoard);
        computer.setRam(ram);
        return computer;
    }
}
