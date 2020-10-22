package com.example.fined187.Test.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FileReader {

    public static String getResource(String fileName) throws Exception {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource(fileName);
        StringBuilder builder = new StringBuilder();

        if (url == null) {
            System.out.println(String.format("The file does not exist in classpath. fileName : %s", fileName));
            System.exit(0);
        }

        File file = new File(url.getFile());

        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(file));

            String line = reader.readLine();

            while (line != null) {
                builder.append(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString().replaceAll(" ", "");
    }
}
