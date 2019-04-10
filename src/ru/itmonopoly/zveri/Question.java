package ru.itmonopoly.zveri;

public class Question {
    String question;
    Object yes;
    Object no;
    Object parent;
    public  Question (String s,  Object parent) {
        this.question = s;
        this.parent = parent;
    }
}
