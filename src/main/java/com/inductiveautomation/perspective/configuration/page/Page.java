package com.inductiveautomation.perspective.configuration.page;

import javax.swing.*;

public class Page {
    /**
     * Page Configurator
     */
    private String add() {
        return "Add (Добавить) —  создает новую конфигурацию страницы.";
    }

    private String trash() {
        return "Trash (Корзина ) —  удаляет выбранную конфигурацию страницы.";
    }

    public void page() {


        String[] config = {"add", "trash"};
        String res = (String) JOptionPane.showInputDialog(null, "select an action in Page Configurator", "Page Configurator",
                JOptionPane.PLAIN_MESSAGE, null, config, config[0]);
        switch (res) {
            case "add":
                System.out.println(add());
                JOptionPane.showMessageDialog(null, add());
                break;

            case "trash":
                System.out.println(trash());
                JOptionPane.showMessageDialog(null, trash());
                break;
        }
    }

    public static void main(String[] args) {
        Page page = new Page();
        page.page();
    }
}
