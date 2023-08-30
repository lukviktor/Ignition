package com.inductiveautomation.startup.guide;

import com.inductiveautomation.perspective.configuration.joptionpane.InputOutputPane;
import com.inductiveautomation.perspective.configuration.joptionpane.SharedMethod;

import java.util.stream.IntStream;

public class CreateTags {
    /**
     * Создание Tegs
     */
    public void createTags() {
        String[] message = {
                "Tab Browser, нажмите кнопку \"Add\" ",
                "Выделите нужные Теги и нажмите \"стрелку вправо\"",
                "Перейдите на вкладку  «Tegs» и откройте папку"
        };

        String[] image = {
                "src/main/resources/Connect/CreateTags/clickAddIcon.png",
                "src/main/resources/Connect/CreateTags/SelecktAndAddTeg.png",
                "src/main/resources/Connect/CreateTags/tegsFolder.png"
        };

        new SharedMethod().show(message, image);
    }

    public static void main(String[] args) {
        new CreateTags().createTags();
    }
}
