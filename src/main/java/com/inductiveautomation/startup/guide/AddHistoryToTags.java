package com.inductiveautomation.startup.guide;

import com.inductiveautomation.perspective.configuration.joptionpane.InputOutputPane;

public class AddHistoryToTags {

    /**
     * Добавить историю к тегам
     */
    public void addHistoryToTags() {
        String[] messageAddHistoryToTags = {
                "Выделите tegs и нажмите \"Edit tag(s)\"",
                "History Enabled установите \"true\"",
                "Выберете \"Storage Provider\", и другое и нажмите \"OK\"",
                "Теперь в Tag Browser, справа от тега появился значек."
        };
        String[] iconAddHistoryToTags = {
                "src/main/resources/Connect/AddHistoryToTags/EditTag(s).png",
                "src/main/resources/Connect/AddHistoryToTags/HistoryEnabled.png",
                "src/main/resources/Connect/AddHistoryToTags/StorageProvider.png",
                "src/main/resources/Connect/AddHistoryToTags/seeIcon.png"
        };

        InputOutputPane pane = new InputOutputPane();
        for (int i = 0; i < messageAddHistoryToTags.length; i++) {

            pane.outputMessage(messageAddHistoryToTags[i]);
            pane.output(iconAddHistoryToTags[i]);
        }
    }

    public static void main(String[] args) {
        new AddHistoryToTags().addHistoryToTags();
    }
}
