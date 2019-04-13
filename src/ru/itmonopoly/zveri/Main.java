package ru.itmonopoly.zveri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Zver root = new Zver("лает", null, false);
        root.yes = new Zver("хитрое", root, false);
        root.yes.no = new Zver("собака", root.yes, true);
        root.yes.yes = new Zver("рыжее", root.yes, false);
        root.yes.yes.yes = new Zver("лиса", root.yes, true);
        root.yes.yes.no = new Zver("шакал", root.yes, true);
        root.no = new Zver("мяукает", root, false);
        root.no.no = new Zver("живет в норке", root.no, false);
        root.no.no.yes = new Zver("мышка", root.no, true);
        root.no.no.no = new Zver("лошадь", root.no, true);
        root.no.yes = new Zver("большое", root.no, false);
        root.no.yes.yes = new Zver("лев", root.no, true);
        root.no.yes.no = new Zver("кошка", root.no, true);
        System.out.println("Задумайте животное");
        try {
            root.game(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

