package com.inductiveautomation.startup.guide;

import com.inductiveautomation.perspective.configuration.joptionpane.InputOutputPane;

public class ConnectToDevice {
    /**
     * Подключитесь к устройству
     */
    public void connect() {
        InputOutputPane pane = new InputOutputPane();
        
        String pageConfig = "src/main/resources/Connect/pageConfig.png";
        pane.output(pageConfig);
        String deviceConnections = "Прокрутите вниз до  раздела OPC  UA  слева до  пункта «Подключения устройств».";
        pane.outputMessage(deviceConnections);

        String createNewDevice = "src/main/resources/Connect/CreateNewDevice.png";
        pane.output(createNewDevice);
        String programmableDeviceSimulator = "Выберите симулятор программируемого устройства и нажмите «Далее».";
        pane.outputMessage(programmableDeviceSimulator);

        String imageProgrammableDeviceSimulator = "src/main/resources/Connect/ProgrammableDeviceSimulator.png";
        pane.output(imageProgrammableDeviceSimulator);

        String nameCreateNewDevice = "Дайте новому соединению имя и нажмите «Создать новое устройство».";
        pane.outputMessage(nameCreateNewDevice);
        String messageNameCreateNewDevice = "src/main/resources/Connect/nameCreateNewDevice.png";
        pane.output(messageNameCreateNewDevice);

        String moreEditProgram = "Выберете - More > edit program.";
        pane.outputMessage(moreEditProgram);
        String imageMoreEditProgram = "src/main/resources/Connect/MoreEditProgram.png";
        pane.output(imageMoreEditProgram);

    }


    public static void main(String[] args) {
        new ConnectToDevice().connect();
    }
}
