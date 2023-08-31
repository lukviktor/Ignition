package com.inductiveautomation.perspective.configuration.page;

import com.inductiveautomation.joptionpane.SharedMethod;

import javax.swing.*;
import java.awt.*;


public class SelectProp {
    /**
     * Function selection window in Session Properties
     */
    private void sessionPropertiesInstall() {
        String[] description = {
                "Уникальный идентификатор сеанса.",
                "Отражает IP-адрес или имя хоста подключающейся системы.",
                "Тема , которая будет использоваться в сеансе.",
                "Текущая локаль этого сеанса.",
                "Идентификационный код часового пояса.",
                "Информация когда с сеансом взаимодействовали.",
                "Аутентификацию и авторизацию пользователя для этого сеанса. ",
                "Свойства шлюза, на котором работает этот сеанс.",
                "Свойства устройства, на котором запущен сеанс.",
                "Bluetooth устройства.",
                "Службами геолокации устройства.",
                "Настройки закрепленной внизу панели приложений.",
                "Объект, содержащий свойства, относящиеся к каналам.",
                "Настройки анимации и внешнего вид.",
                "Представляет IP-адрес сеанса, каким его видит шлюз."
        };
        String[] nameSessionProperties = {
                "id",
                "host",
                "theme",
                "locale",
                "timeZoneId",
                "lastActivity",
                "auth",
                "gateway",
                "device",
                "bluetooth",
                "geolocation",
                "appBar",
                "pipes",
                "symbols",
                "address"
        };

        new SharedMethod().showM(nameSessionProperties, description);
    }

    public void showProp() {
        sessionPropertiesInstall();
    }

    public static void main(String[] args) {
        new SelectProp().showProp();
    }
}
