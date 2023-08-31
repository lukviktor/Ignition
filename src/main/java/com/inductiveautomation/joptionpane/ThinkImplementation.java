package com.inductiveautomation.joptionpane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThinkImplementation {
    private void metod1(Object obj) {
        if (obj instanceof String) {
            System.out.println("Обьект строка");
        } else if (obj instanceof Integer) {
            System.out.println("Обьект целое число");
        } else {
            System.out.println("Другой тип");
        }
    }

    private void metod2(Object obj) {
        Class<?> clazz = obj.getClass();
        if (clazz == String.class) {
            System.out.println("Обьект строка");
        } else if (clazz == Integer.class) {
            System.out.println("Обьект целое число");
        } else {
            System.out.println("Другой тип");
        }
    }

    private void metod3(Object obj) {
        Class<?> clazz = obj.getClass();
        if (clazz.equals(String.class)) {
            System.out.println("Обьект строка");
        } else if (clazz.equals(Integer.class)) {
            System.out.println("Обьект целое число");
        } else if (clazz.equals(Double.class)) {
            System.out.println("Обьект с плавоющей точкой");
        } else {
            System.out.println("Другой тип");
        }
    }

    private void metod4() {
        Object obj;
        String[] strings = {"a", "b", "c"};
        obj = strings;
        System.out.println(obj);

        String ddd = "строка";
        obj = ddd;
        System.out.println(obj);

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        obj = list;
        System.out.println(obj);
    }
}
