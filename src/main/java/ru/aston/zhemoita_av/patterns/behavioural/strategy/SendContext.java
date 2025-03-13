package ru.aston.zhemoita_av.patterns.behavioural.strategy;

public class SendContext {
    private Sendable strategy;

    public void setStrategy(Sendable strategy) {
        this.strategy = strategy;
    }

    public  void executeSend(String message) {
        strategy.send(message);
    }
}
/**
 * Это общий класс контекст. Вместо того, чтобы изначальный класс сам выполнял тот или иной алгоритм, он будет играть роль контекста, ссылаясь на одну из стратегий и делегируя ей выполнение работы. Чтобы сменить алгоритм, вам будет достаточно подставить в контекст другой объект-стратегию.
 * */