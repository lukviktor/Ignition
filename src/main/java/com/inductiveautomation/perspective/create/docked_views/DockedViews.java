package com.inductiveautomation.perspective.create.docked_views;

import javax.swing.*;

public class DockedViews {
    public void dockedViews() {
        String[] config = {"Настройка", "Редактирование"};
        String res = (String) JOptionPane.showInputDialog(null, "Работа с DockedViews",
                "Page Configurator",
                JOptionPane.PLAIN_MESSAGE,
                null, config, config[0]);
        switch (res) {
            case "Настройка":
                JOptionPane.showMessageDialog(null,
                        new ImageIcon("src/main/resources/DockedView/ConfiguringDockedView.png"));
                break;

            case "Редактирование":
                JOptionPane.showMessageDialog(null,
                        new ImageIcon("src/main/resources/DockedView/EditingExistingDockedView.png"));
                PropertiesDockerViews dockerViews = new PropertiesDockerViews();
                dockerViews.viewerProperty();
                break;
        }
    }

    public static void main(String[] args) {
        DockedViews dockedViews = new DockedViews();
        dockedViews.dockedViews();
    }
}
