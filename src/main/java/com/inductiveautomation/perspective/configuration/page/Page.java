package com.inductiveautomation.perspective.configuration.page;

import com.inductiveautomation.joptionpane.InputOutputPane;

public class Page {
    /**
     * Page Configurator
     */
    private void pageInstall() {
        String[] name = {
                "add",
                "trash"
        };
        String[] description = {
                " (Добавить) —  создает новую конфигурацию страницы.",
                " (Корзина ) —  удаляет выбранную конфигурацию страницы."
        };

        new InputOutputPane().output(name, description, "Page Configurator", null);
    }

    public void page() {
        pageInstall();
    }

    public static void main(String[] args) {
        new Page().page();
    }
}
