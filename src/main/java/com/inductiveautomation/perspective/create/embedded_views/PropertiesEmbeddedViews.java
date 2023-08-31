package com.inductiveautomation.perspective.create.embedded_views;

import com.inductiveautomation.joptionpane.InputOutputPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropertiesEmbeddedViews {
    private List<String> nameProperty() {
        return new ArrayList<>(Arrays.asList(
                "path", "params", "useDefaultViewWidth", "useDefaultViewHeight", "loading", "style"
        ));
    }

    private List<String> description() {
        return new ArrayList<>(Arrays.asList(
                "Путь к представлению, которое вы хотите встроить.",
                "Параметры представления.",
                "Использование ширины представления.",
                "Использование высоты представления.",
                "Посмотреть настройки загрузки."

        ));
    }

    public static void main(String[] args) {
        new InputOutputPane().
                inputArray(new PropertiesEmbeddedViews().nameProperty(),
                new PropertiesEmbeddedViews().description(),
                "Настройки Docker Views", "Properties");
    }
}
