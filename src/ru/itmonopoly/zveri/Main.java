package ru.itmonopoly.zveri;

public class Main {
    public static void main(String[] args) {
        Question root = new Question("лвет", null);
        Zver dog = new Zver("собака", root);
        root.yes = dog;
        root.no = new Question("мяукает", root);
        ((Question) root.no).no = new Zver("мышь", root.no);
        ((Question) root.no).yes = new Zver("кошка", root.no);
    }
}
