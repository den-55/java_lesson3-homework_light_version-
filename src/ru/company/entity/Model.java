package ru.company.entity;

import java.awt.*;

public class Model extends SiemensMobile {

    private Integer screenDiagonal;
    private Integer weight;
    private Integer cost;
    private Color color;
    private Boolean isFingerprint;

    public Model(String model, String owner, Boolean isAndroid, String countryOfManufacture, String chargingSocket, Integer screenDiagonal, Integer weight, Integer cost, Color color, Boolean isFingerprint) {
        super(model, owner, isAndroid, countryOfManufacture, chargingSocket);
        this.screenDiagonal = screenDiagonal;
        this.weight = weight;
        this.cost = cost;
        this.color = color;
        this.isFingerprint = isFingerprint;
    }

    public Integer getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(Integer screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean getFingerprint() {
        return isFingerprint;
    }

    public void setFingerprint(Boolean fingerprint) {
        isFingerprint = fingerprint;
    }

    @Override
    public String call() {
        return "звоню";
    }

    @Override
    public String sendMessage(String name) {
        return "отправляю сообщение " + name;
    }

    @Override
    public String openApp(String application) {
        return "открываю приложение " + application;
    }

    @Override
    public String turnOn() {
        return "включился";
    }

    @Override
    public String turnOff() {
        return "выключился";
    }

    @Override
    public String toString() {
        return "Model{" +
                "screenDiagonal=" + screenDiagonal +
                ", weight=" + weight +
                ", cost=" + cost +
                ", color=" + color +
                ", isFingerprint=" + isFingerprint +
                ", model='" + model + '\'' +
                ", owner='" + owner + '\'' +
                ", isAndroid=" + isAndroid +
                ", countryOfManufacture='" + countryOfManufacture + '\'' +
                ", chargingSocket='" + chargingSocket + '\'' +
                '}' + " " + call() + " /" + sendMessage("Вася") + " /" + openApp("такси" + " /" + turnOn() + " /" + turnOff());
    }
}
