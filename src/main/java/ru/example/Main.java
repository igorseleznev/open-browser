package ru.example;

import java.awt.*;
import java.net.URI;

public class Main {

    public static void main(String[] args) {
        try {
            Desktop desk = Desktop.getDesktop();
            desk.browse(new URI(args[0]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
