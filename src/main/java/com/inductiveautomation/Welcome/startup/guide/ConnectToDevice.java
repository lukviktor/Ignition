package com.inductiveautomation.Welcome.startup.guide;

import com.inductiveautomation.joptionpane.InputOutputPane;
import com.inductiveautomation.joptionpane.SharedMethod;

public class ConnectToDevice {
    /**
     * Подключитесь к устройству
     */
    public void connectDevice() {
        InputOutputPane pane = new InputOutputPane();
        String[] message = {
                "Прокрутите вниз \"OPC UA\" -> \"Device Connections\" -> \"Create new Device.\".",
                "Выберите из списка и нажмите \"Next\".",
                "Создайте \"name\" и нажмите \"Create New Device\".",
                "Выберете - \"More\" > \"edit program\".",
                "Выберете из списка и нажмите \"Load Simulator Program\"",
                "Вы увидите ряд инструкций. Нажмите кнопку \"Save Program\"",
        };
        String[] image = {
                "src/main/resources/Connect/ConnectToDevice/pageConfig.png",
                "src/main/resources/Connect/ConnectToDevice/ProgrammableDeviceSimulator.png",
                "src/main/resources/Connect/ConnectToDevice/nameCreateNewDevice.png",
                "src/main/resources/Connect/ConnectToDevice/MoreEditProgram.png",
                "src/main/resources/Connect/ConnectToDevice/LoadSimulatorProgram.png",
                "src/main/resources/Connect/ConnectToDevice/ClickSaveProgram.png"
        };

        new SharedMethod().show(message, image);
    }

    public static void main(String[] args) {
        new ConnectToDevice().connectDevice();
    }
}

