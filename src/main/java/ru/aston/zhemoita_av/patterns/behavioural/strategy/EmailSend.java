package ru.aston.zhemoita_av.patterns.behavioural.strategy;

public class EmailSend implements Sendable{
    @Override
    public void send(String message) {
        System.out.println("Сообщение: \"" + message + "\" отправлено по e-mail.");
    }
}

/**
 * Важно, чтобы все стратегии имели общий интерфейс. Используя этот интерфейс, контекст будет независимым от конкретных классов стратегий.
 * */
