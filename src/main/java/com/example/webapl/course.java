package com.example.webapl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class course {

    public static String getHTML(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        try(BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()))) {
            for(String line; (line  = reader.readLine()) !=null; ) {
                result.append(line);
            }
        }
        return result.toString();
    }
}