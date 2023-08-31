package com.inductiveautomation.Welcome.startup.guide;

import com.inductiveautomation.joptionpane.SharedMethod;

public class AddHistoryToTags {
    /**
     * Добавить историю к тегам
     */
    public void addHistoryToTags() {
        String[] message = {
                "Выделите tegs и нажмите \"Edit tag(s)\"",
                "History Enabled установите \"true\"",
                "Выберете \"Storage Provider\", и другое и нажмите \"OK\"",
                "Теперь в Tag Browser, справа от тега появился значок."
        };
        String[] image = {
                "src/main/resources/Connect/AddHistoryToTags/EditTag(s).png",
                "src/main/resources/Connect/AddHistoryToTags/HistoryEnabled.png",
                "src/main/resources/Connect/AddHistoryToTags/StorageProvider.png",
                "src/main/resources/Connect/AddHistoryToTags/seeIcon.png"
        };

        new SharedMethod().show(message, image);
    }

    public static void main(String[] args) {
        new AddHistoryToTags().addHistoryToTags();
    }
}
