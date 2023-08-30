package com.inductiveautomation.perspective.configuration.joptionpane;

import javax.swing.*;
import java.util.List;

public class InputOutputPane {

    /**
     * Преобразование Array в массив
     */
    private String[] arrayConversion(List<String> arrayList) {
        return arrayList.toArray(new String[0]);
    }

    /**
     * Отображение вопроса и ответа на полученный запрос с ArrayList
     */
    public void inputArray(List<String> inputArrayList, List<String> outputArrayList, String massege, String title) {
        String[] value = arrayConversion(inputArrayList);
        String res = (String) JOptionPane.showInputDialog(null, massege, title,
                JOptionPane.PLAIN_MESSAGE, null, value, value[0]);

        int index = inputArrayList.indexOf(res);
        JOptionPane.showMessageDialog(null, inputArrayList.get(index) + ": " + outputArrayList.get(index));
    }

    /**
     * Отображение вопроса с массива
     */
    public String inputArray(String[] value, String message, String title) {
        return (String) JOptionPane.showInputDialog(null, message, title,
                JOptionPane.PLAIN_MESSAGE, null, value, value[0]);
    }

    /**
     * Отображение ответа в формате картинки (.png)
     */
    public void output(String pathFileImage) {
        JOptionPane.showMessageDialog(null,
                new ImageIcon(pathFileImage));
    }

    public void outputMessage(String pathMessage) {
        JOptionPane.showMessageDialog(null, pathMessage);
    }
}
