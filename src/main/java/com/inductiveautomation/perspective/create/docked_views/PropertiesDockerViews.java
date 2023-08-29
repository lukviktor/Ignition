package com.inductiveautomation.perspective.create.docked_views;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropertiesDockerViews {
    // View, Display, Resizable?, Modal?, Content, Anchor, Size, Auto Breakpoint, Dock ID, Handle, Handle Icon, View Parameters, Remove
    public List<String> nameProperty() {
        return new ArrayList<>(Arrays.asList(
                "Anchor", "Auto Breakpoint", "Content", "Display",
                "Dock ID", "Handle", "Handle Icon", "Modal?",
                "Remove", "Resizable?", "Size", "View", "View Parameters"
        ));
    }

    public List<String> description() {
        return new ArrayList<>(Arrays.asList(
                "Представление всегда видимым при прокрутке.",
                "Управляет минимальной шириной страницы для отображения.",
                "Определяет, как взаимодействует с другими представлениями.",
                "Позволяет показать или скрыть DockerViews",
                "Ссылка на закрепленное представление через другие части Perspective",
                "Позволяет показывать или скрывать маркер",
                "Путь DockerViews, используемому для идентификации представления",
                "Определяет, должно ли представление быть модальным",
                "Удаляет представление со страницы.",
                "Можно ли изменить размер прикрепленного представления или нет.",
                "Текущий выбранный вид",
                "Позволяет передавать параметры при переходе на страницу."

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
        PropertiesDockerViews dockerViews = new PropertiesDockerViews();
        dockerViews.viewerProperty();
    }
}
