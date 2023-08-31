package com.inductiveautomation.joptionpane;

import java.util.stream.IntStream;

public class SharedMethod {
    /**
     * Для отображения
     */
    public void show(String[] message, String[] image) { // отображение с картинкой
        IntStream.range(0, message.length).forEach(i -> {
            new InputOutputPane().outputMessage(message[i]);
            new InputOutputPane().output(image[i]);
        });
    }
    public void showM(String[] name, String[] description) { // Отображение в виде текста
        IntStream.range(0, name.length).forEach(i -> {
            new InputOutputPane().outputMessage(name[i] + ": " + description[i]);
        });
    }
}
