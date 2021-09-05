package hw1;

import java.lang.reflect.Array;

public class Main {

//Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);



    public static void main(String[] args) {

        String[] cities = new String[2];
        Cities italianCapital = new Cities("Rome");
        Cities frenchCapital = new Cities("Paris");

        cities[0] = italianCapital.getName();
        cities[1] = frenchCapital.getName();


    }


    static class Cities {
        public String name;

        private Cities(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }


    public  void swapNames(String name1, String name2) {
        String temp = name1;
        name1 = name2;
        name2 = name1;
    }







}

