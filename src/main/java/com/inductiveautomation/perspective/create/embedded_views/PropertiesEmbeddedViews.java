package com.inductiveautomation.perspective.create.embedded_views;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropertiesEmbeddedViews {
    public List<String> nameProperty() {
        return new ArrayList<>(Arrays.asList(
                "path", "params", "useDefaultViewWidth", "useDefaultViewHeight", "loading", "style"
        ));
    }

    private List<String> description() {
        return new ArrayList<>(Arrays.asList(
                "Путь  к представлению, которое вы хотите встроить.",
                "Параметры представления.",
                "Использование ширины представления.",
                "Использование высоты представления.",
                "Посмотреть настройки загрузки."

        ));
    }

    public void viewerProperty() {
        String[] value = nameProperty().toArray(new String[0]);
        String res = (String) JOptionPane.showInputDialog(null, "Настройки Docker Views", "Properties",
                JOptionPane.PLAIN_MESSAGE, null, value, value[0]);

        int index = nameProperty().indexOf(res);
        System.out.println(nameProperty().get(index) + ": " + description().get(index));
        JOptionPane.showMessageDialog(null, nameProperty().get(index) + ": " + description().get(index));
    }

    public static void main(String[] args) {
        PropertiesEmbeddedViews dockerViews = new PropertiesEmbeddedViews();
        dockerViews.viewerProperty();
    }
}
