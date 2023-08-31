package com.inductiveautomation.Welcome.startup.guide;

import com.inductiveautomation.joptionpane.SharedMethod;

public class CreateProject {
    public void createProject() {
        String[] message = {
                "Откройте Designer Launcher отобразится \"Open/Create Project \"",
                "Откроется окно \"Project Setup window\"",
                "Открывается конфигурация страницы \"Perspective Page Configuration\"."
        };
        String[] image = {
                "src/main/resources/CreateProject/OpenCreateProject.png",
                "src/main/resources/CreateProject/ProjectSetupWindow.png",
                "src/main/resources/CreateProject/PerspectivePageConfiguration.png"
        };
        new SharedMethod().show(message, image);
    }

    public static void main(String[] args) {
        new CreateProject().createProject();
    }
}
