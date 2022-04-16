package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
        public void whenGreetBot() {
            String in = "Привет бот";
            String result = DummyBot.answer(in);
            String expected = "Привет, умник. ";
            assertEquals(expected, result);
    }

    @Test
    public void whenBuyBot() {
        String in = "Пока";
        String result = DummyBot.answer(in);
        String expected = "Бот: До скорой встречи";
        assertEquals(expected, result);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Эй алё";
        String result = DummyBot.answer(in);
        String expected = "Бот: Это ставит меня в тупик. Задайте другой вопрос.";
        assertEquals(expected, result);
    }

}