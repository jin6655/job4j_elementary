package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Бот: Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет бот".equals(question)) {
            rsl = "Привет, умник. ";
        } else if ("Пока".equals(question)) {
            rsl = "Бот: До скорой встречи";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет бот. ");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пользователь: Эй. Тут кто нибудь есть?");
        System.out.println(rsl);
    }
}
