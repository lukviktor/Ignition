package com.inductiveautomation.perspective.create.docked_views;

import com.inductiveautomation.joptionpane.InputOutputPane;

public class DockedViews {
    public void dockedViews() {
        String[] value = {"Настройка", "Редактирование"};
        String message = "Работа с DockedViews";
        String title = "Page Configurator";
        switch (new InputOutputPane().inputArray(value, message,
                title)) {
            case "Настройка":
                String configuringDockedView = "src/main/resources/DockedView/ConfiguringDockedView.png";
                new InputOutputPane().output(configuringDockedView);
                break;

            case "Редактирование":
                String editingExistingDockedView = "src/main/resources/DockedView/EditingExistingDockedView.png";
                new InputOutputPane().output(editingExistingDockedView);
                new PropertiesDockerViews().view();
                break;
        }
    }

    public static void main(String[] args) {
        new DockedViews().dockedViews();
    }
}
