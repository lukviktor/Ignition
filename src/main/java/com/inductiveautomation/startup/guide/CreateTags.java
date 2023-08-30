package com.inductiveautomation.startup.guide;

import com.inductiveautomation.perspective.configuration.joptionpane.InputOutputPane;

public class CreateTags {
    public void createTags() {
        String[] messageCreateTags = {
                "Tab Browser, нажмите кнопку \"Add\" ",
                "Выделите нужные Теги и нажмите \"стрелку вправо\"",
                "Перейдите на вкладку  «Tegs» и откройте папку"
        };

        String[] imageCreateTags = {
                "src/main/resources/Connect/CreateTags/clickAddIcon.png",
                "src/main/resources/Connect/CreateTags/SelecktAndAddTeg.png",
                "src/main/resources/Connect/CreateTags/tegsFolder.png"
        };

        InputOutputPane pane = new InputOutputPane();
        for (int i = 0; i<messageCreateTags.length;i++) {
            //System.out.println(connectDB[i]);

            pane.outputMessage(messageCreateTags[i]);
            pane.output(imageCreateTags[i]);
        }
    }

    public static void main(String[] args) {
        new CreateTags().createTags();
    }
}
