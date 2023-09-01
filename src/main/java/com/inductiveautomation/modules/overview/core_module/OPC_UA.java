package com.inductiveautomation.modules.overview.core_module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OPC_UA {
    private void driverModules() {
        HashMap<Object, Object> driverModules = new HashMap<>();
    }

    private void Allen_BradleyEthernet() {
        List<String> capability = new ArrayList<>(Arrays.asList(
                "Подключайтесь к устройствам семейства  Allen-Bradley Logix, включая устройства с прошивкой v21+.",
                "Подключитесь к микропрограмме ControlLogix v20 и более ранним процессорам.",
                "Подключитесь к микропрограмме CompactLogix v20 и более ранним процессорам.",
                "Подключайтесь к MicroLogix 1100, 1200, 1400 and 1500 series PLCs.",
                "Подключайтесь к PLC5s через  Ethernet.",
                "Подключайтесь к SLC 5/05s через  Ethernet."
        ));

        List<String> pls = new ArrayList<>(Arrays.asList(
                "Logix Driver",
                "ControlLogix",
                "CompactLogix",
                "MicroLogix",
                "PLC5",
                "SLC"
        ));

        HashMap<String, String> allen = new HashMap<>();
        for (int i = 0; i < pls.size(); i++) {
            allen.put(pls.get(i), capability.get(i));
        }
        System.out.println(allen);
    }

    public static void main(String[] args) {
        new OPC_UA().Allen_BradleyEthernet();
    }
}
