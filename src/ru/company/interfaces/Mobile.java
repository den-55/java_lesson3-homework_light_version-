package ru.company.interfaces;

public interface Mobile {

    String call();
    String sendMessage(String name);
    String openApp(String application);
    String turnOn();
    String turnOff();
}
