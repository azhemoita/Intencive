package ru.aston.zhemoita_av.patterns.behavioural.strategy;

public interface Sendable {
    void send(String message);
}
/**
 * Это интерфейс для создания общего метода для всех классов различных стратегий отправки сообщений.
 * Используя этот интерфейс, контекст будет независимым от конкретных классов стратегий.
 * */