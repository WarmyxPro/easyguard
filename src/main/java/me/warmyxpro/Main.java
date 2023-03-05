package me.warmyxpro;

import me.warmyxpro.utils.HWIDUtils;

public class Main {

    public static String HWID_URL = "https://raw.githubusercontent.com/WarmyxPro/easyguard/main/hwids";

    public static void main(String[] args) {
        // Генерируем хвид
        String hwid = HWIDUtils.getHWID();

        if(!Guard.auth(hwid)) {
            System.out.println("Вы не были обнаружены в базе данных. Выключение.");
            System.exit(0);
        }

        // запускаем саму программу, т.к человек прошёл проверку
        app();

    }

    public static void app() {
        System.out.println(String.format("Добро пожаловать, %s! Вы успешно прошли проверку по железу.", System.getProperty("user.name")));
    }

}
