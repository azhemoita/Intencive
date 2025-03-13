package ru.aston.zhemoita_av.patterns.behavioural.strategy;

public class SMSSend implements Sendable{
    @Override
    public void send(String message) {
        System.out.println("Сообщение: \"" + message + "\" отправлено по SMS.");
    }
}
