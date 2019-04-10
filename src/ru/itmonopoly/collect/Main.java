package ru.itmonopoly.collect;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer;
        Set members = new HashSet();
        for (int i = 1; i < 6; i++) {
            Person p = new Person();
            System.out.println("Ваше имя:");
            answer = br.readLine();
            p.name = answer;
            System.out.println("Ваша фамилия:");
            answer = br.readLine();
            p.lastName = answer;
            System.out.println("Город:");
            answer = br.readLine();
            p.city = answer;
            System.out.println("Возраст:");
            answer = br.readLine();
            p.age = Integer.parseInt(answer);
            boolean b = members.add(p);
            if (!b) {
                System.out.println("Такой участник уже есть");
                i--;
            }
        }
        System.out.println("Зарегистрировалось " + members.size() + " участников.");
        Iterator it = members.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
