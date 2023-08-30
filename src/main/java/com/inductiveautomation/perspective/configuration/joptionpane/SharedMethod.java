package com.inductiveautomation.perspective.configuration.joptionpane;

import com.inductiveautomation.perspective.configuration.joptionpane.InputOutputPane;

import java.util.stream.IntStream;

public class SharedMethod {
    /**
     * Для отображения
     */
    public void show(String[] message, String[] image) {
        IntStream.range(0, message.length).forEach(i -> {
            new InputOutputPane().outputMessage(message[i]);
            new InputOutputPane().output(image[i]);
        });
    }
}
