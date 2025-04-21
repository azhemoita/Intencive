package ru.aston.zhemoita_av.patterns.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        SendContext sendContext = new SendContext();

        sendContext.setStrategy(new EmailSend());
        sendContext.executeSend("Привет! Это тестовое сообщение для отправки по e-mail!");

        sendContext.setStrategy(new SMSSend());
        sendContext.executeSend("Привет! Это тестовое сообщение для отправки по СМС!");

        sendContext.setStrategy(new PushSend());
        sendContext.executeSend("Привет! Это тестовое сообщение для отправки push-уведомлением!");
    }
}

/**
 * Стратегия — это поведенческий паттерн проектирования, который определяет семейство схожих алгоритмов и помещает каждый из них в собственный класс, после чего алгоритмы можно взаимозаменять прямо во время исполнения программы.
 * */
