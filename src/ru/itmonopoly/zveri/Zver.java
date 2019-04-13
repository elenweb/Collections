package ru.itmonopoly.zveri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zver {
    String name;
    Zver parent;
    Boolean type; // true - zver; false - question
    Zver yes;
    Zver no;


    public Zver(String name, Zver parent, Boolean type) { //конструктор
        this.name = name;
        this.parent = parent;
        this.type = type;
    }

    public void game(Zver z) throws IOException { //запуск игры
        if (this.type) {
            this.end(z);
        } else {
            this.question(z);
        }
    }

    public void question(Zver z) throws IOException { //если z вопрос
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer;
        System.out.println("Оно " + this.name + "? (+/-)");
        answer = checkAnswer(br.readLine());
            if (answer.equals("+")) {
            if (this.yes.type) {
                this.yes.end(z);
            } else {
                this.yes.question(z);
            }
        } else {
            if (this.no.type) {
                this.no.end(z);
            } else {
                this.no.question(z);
            }
        }
    }

    public void end(Zver z) throws IOException { //если z животное
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer;
        System.out.println("Это " + this.name + "? (+/-)");
        answer = checkAnswer(br.readLine());
        if (answer.equals("+")) {
            System.out.println("Угадала!");
        } else {
            if ((this.parent.no.type)&&!(this==this.parent.no)) {
                this.parent.no.end(z);
            } else {
                System.out.println("Не угадала..."); //сюда пойдет метод добавления нового животного
            }
        }
        System.out.println("Сыграем еще? (+/-)");
        answer = checkAnswer(br.readLine());
        if (answer.equals("-")) {
            System.out.println("Спасибо за игру!");
        } else {
            z.game(z);
        }
    }

    public static String checkAnswer(String s) throws IOException { // проверка ввода
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean b = true;
        while (b) {
            if (s.equals("+") || s.equals("-")) {
                return s;
            } else {
                System.out.println("Подходит только '+' или '-'. Повторите ввод пожалуйста.");
                s = br.readLine();
            }
        }
        return s;
    }
}

