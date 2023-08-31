package com.inductiveautomation.Welcome.startup.guide;

import com.inductiveautomation.joptionpane.SharedMethod;

public class ConnectToDatabase {
    /**
     * Подключение к базе данных
     */
    public void connectDB() {
        String[] message = {
                "Config -> Databases -> Select SQL -> Next.",
                "Введите Name и Connect URL и нажмите Create New Database Connection.",
                "Ждите появится сообщение об успешном завершении."
        };
        String[] image = {
                "src/main/resources/Connect/ConnectToDatabase/SelectTypeSQL.png",
                "src/main/resources/Connect/ConnectToDatabase/enterName_ ConnectURL.png",
                "src/main/resources/Connect/ConnectToDatabase/databaseConnectionCreated.png"
        };
        new SharedMethod().show(message, image);
    }


    public static void main(String[] args) {
        new ConnectToDatabase().connectDB();
    }
}
