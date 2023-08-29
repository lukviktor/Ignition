package com.inductiveautomation.perspective.configuration.page;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SessionProperties {

    public void sessionProperties() {


    }
    public void outProp(int index) {
        name().get(index);
        description().get(index);
        
    }


    public ArrayList<String> name() {
        return Arrays.stream(NameSessionProperties.values()).map(String::valueOf).collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<String> description() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "Уникальный идентификатор сеанса.",
                "Отражает IP-адрес или имя хоста подключающейся системы.",
                "Тема , которая будет использоваться в сеансе.",
                "Текущая локаль этого сеанса.",
                "Идентификационный код часового пояса, например America/Los_Angeles.",
                "Только для чтения, который представляет собой последний раз, когда с сеансом взаимодействовали, например, когда пользователь щелкал внутри сеанса. Время, сообщаемое этим свойством, основано на времени шлюза. ",
                "Представляет аутентификацию и авторизацию пользователя для этого сеанса. ",
                "Свойства шлюза, на котором работает этот сеанс.",
                "Свойства устройства, на котором запущен сеанс.",
                "Параметры и данные, предоставляемые службами Bluetooth устройства.",
                "Параметры и данные, предоставляемые веб-службами или собственными службами геолокации устройства.",
                "Настройки, относящиеся к закрепленной внизу панели приложений, на которой указана информация о шлюзе.",
                "Объект, содержащий свойства, относящиеся к каналам.",
                "Настройки, относящиеся к компонентам на  палитре символов перспективы. Анимация и внешний вид.",
                "Представляет IP-адрес сеанса, каким его видит шлюз."
        ));
        return list;
    }



    public static void main(String[] args) {
        SessionProperties sp = new SessionProperties();
        System.out.println(sp.name());
        System.out.println(sp.description());
        System.out.println(sp.name().get(4));
    }
}
