package ru.job4j.stream;

public class Computer {
    private String color;
    private String videoCard;
    private String processor;
    private String motherBoard;
    private String ram;

    public void setColor(String color) {
        this.color = color;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{"
                + "color='" + color + '\''
                + ", videoCard='" + videoCard + '\''
                + ", processor='" + processor + '\''
                + ", motherBoard='" + motherBoard + '\''
                + ", ram='" + ram + '\''
                + '}';
    }
}
