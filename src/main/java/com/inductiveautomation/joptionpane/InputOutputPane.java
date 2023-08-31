package com.inductiveautomation.joptionpane;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.stream.IntStream;

public class InputOutputPane {

    private String[] arrayConversion(List<String> arrayList) {
        return arrayList.toArray(new String[0]);
    }

    private ImageIcon scaleImage(String path) {
        ImageIcon imageIcon = new ImageIcon(path);
        Image image = imageIcon.getImage();
        Image scaledImage = ImageScaler.scaleImage(image, 800, 600);
        return new ImageIcon(scaledImage);
    }

    public void inputArray(List<String> inputArrayList, List<String> outputArrayList, String message, String title) {
        String[] value = arrayConversion(inputArrayList);

        JOptionPane optionPane = new JOptionPane();
        Dimension dimension = new Dimension(800, 600);  // Задаем размеры окна
        optionPane.setPreferredSize(dimension);

        String res = (String) JOptionPane.showInputDialog(null,
                message, title, JOptionPane.PLAIN_MESSAGE, null, value, value[0]);

        int index = inputArrayList.indexOf(res);
        JOptionPane.showMessageDialog(null,
                inputArrayList.get(index) + ": " + outputArrayList.get(index));
    }

    public String inputArray(String[] value, String message, String title) {
        JOptionPane optionPane = new JOptionPane();
        Dimension dimension = new Dimension(800, 600);  // Задаем размеры окна
        optionPane.setPreferredSize(dimension);

        return (String) JOptionPane.showInputDialog(null,
                message, title, JOptionPane.PLAIN_MESSAGE, null, value, value[0]);
    }

    public void output(String pathFileImage) {
        ImageIcon scaledImageIcon = scaleImage(pathFileImage);
        JOptionPane.showMessageDialog(null, scaledImageIcon);
    }

    public void output(String[] name, String[] description, String message, String title) {
        JOptionPane optionPane = new JOptionPane();
        Dimension dimension = new Dimension(800, 600);  // Задаем размеры окна
        optionPane.setPreferredSize(dimension);

        String res = (String) JOptionPane.showInputDialog(null,
                message, title, JOptionPane.PLAIN_MESSAGE, null, name, name[0]);

        int index = IntStream.range(0, name.length)
                .filter(i -> name[i].equals(res))
                .findFirst().orElse(0);

        JOptionPane.showMessageDialog(null,
                name[index] + ": " + description[index]);
    }

    public void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}