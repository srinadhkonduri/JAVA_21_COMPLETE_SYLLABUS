package com.project.bank.utils;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger {

    public static void log(String message) throws IOException {
        FileWriter writer = new FileWriter("transactions.txt", true);
        writer.write(message + "\n");
        writer.close();
    }
}
