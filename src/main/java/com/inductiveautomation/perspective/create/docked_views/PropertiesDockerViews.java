package com.inductiveautomation.perspective.create.docked_views;

import com.inductiveautomation.joptionpane.InputOutputPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropertiesDockerViews {
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

    public void view() {
        String message = "Настройки Docker Views";
        String title = "Properties";

        new InputOutputPane().inputArray(nameProperty(), description(),
                message, title);
    }

    public static void main(String[] args) {

        new PropertiesDockerViews().view();
     }
}
