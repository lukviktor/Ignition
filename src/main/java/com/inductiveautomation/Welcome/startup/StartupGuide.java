package com.inductiveautomation.Welcome.startup;

import com.inductiveautomation.joptionpane.InputOutputPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartupGuide {
    private List<String> description() {
        return new ArrayList<>(Arrays.asList(
                "Подключитесь к устройству",
                "Подключитесь к базе данных",
                "Создать проект.",
                "Создать Tegs.",
                "Добавить историю к тегам"
        ));
    }
    private void startup() {
        String res = new InputOutputPane().inputArray(description());
        for (int i = 0; i<description().size();i++) {
            System.out.println();
        }
//        switch (res) {
//
//            case 1:
//                System.out.println();
//                break;
//        }
    }

    public static void main(String[] args) {
        new StartupGuide().startup();
    }
}
