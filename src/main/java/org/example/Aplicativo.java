package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aplicativo {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        Person caio = new Person("Caio", 4);
        Person david = new Person("David", 20);


        System.out.println(caio.getIdade());

        personList.add(caio);
        personList.add(david);

        for (Person index : personList) {
            System.out.println("Seu nome: "+ index.getNome() +" "+ "Sua idade: "+ index.getIdade());
        }
    }

}
