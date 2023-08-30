package com.inductiveautomation.startup.guide;

import com.inductiveautomation.perspective.configuration.joptionpane.InputOutputPane;

public class ConnectToDatabase {
    /**
     * Подключение к базе данных
     */
    public void connectDB() {
        String[] MessageConnectDB = {
                "Config -> Databases -> Select SQL -> Next.",
                "Введите Name и Connect URL и нажмите Create New Database Connection.",
                "Ждите появится сообщение об успешном завершении."
        };
        String[] imageConnectDB = {
                "src/main/resources/Connect/ConnectToDatabase/SelectTypeSQL.png",
                "src/main/resources/Connect/ConnectToDatabase/enterName_ ConnectURL.png",
                "src/main/resources/Connect/ConnectToDatabase/databaseConnectionCreated.png"
        };
        InputOutputPane pane = new InputOutputPane();
        for (int i = 0; i<MessageConnectDB.length;i++) {

            pane.outputMessage(MessageConnectDB[i]);
            pane.output(imageConnectDB[i]);
        }
    }


    public static void main(String[] args) {
        new ConnectToDatabase().connectDB();
    }
}
