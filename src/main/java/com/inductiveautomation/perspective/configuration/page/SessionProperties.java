package com.inductiveautomation.perspective.configuration.page;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SessionProperties {
    /**
     * Array for PROP name and description
     */

    public ArrayList<String> name() {
        return Arrays.stream(NameSessionProperties.values()).map(String::valueOf).collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<String> description() {
        return new ArrayList<>(Arrays.asList(
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
        ));
    }



    public static void main(String[] args) {
        SessionProperties sp = new SessionProperties();
        System.out.println(sp.name());
        System.out.println(sp.description());
        System.out.println(sp.name().get(4));
    }
}
