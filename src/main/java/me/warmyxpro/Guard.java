package me.warmyxpro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Guard {
    public static boolean auth(String hwid) {

        try {
            String line;
            BufferedReader br;
            HttpURLConnection connection = (HttpURLConnection)new URL(Main.HWID_URL).openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            while((line = br.readLine()) != null) {
                if(line.equals(hwid)) {
                    return true;
                }
            }

            return false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
