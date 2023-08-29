package com.inductiveautomation.perspective.configuration.page;

import javax.swing.*;
import java.awt.*;


public class SelectProp {
    /**
     * Function selection window in Session Properties
     */
    public void showProp() {
        SessionProperties prop = new SessionProperties();
        String[] value = prop.name().toArray(new String[0]);
        String res = (String) JOptionPane.showInputDialog(null, "О каком параметре рассказать?", "PROPS",
                JOptionPane.PLAIN_MESSAGE, null, value, value[0]);

        int index = prop.name().indexOf(res);
        System.out.println(prop.name().get(index) + ": " + prop.description().get(index));
        JOptionPane.showMessageDialog(null, prop.name().get(index) + ": " + prop.description().get(index));
    }

    public static void main(String[] args) {
        SelectProp selectProp = new SelectProp();
        selectProp.showProp();
    }
}
