package hw1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {

// Написать метод, который преобразует массив в ArrayList;
    public static void main(String[] args) {


        String[] cities = new String[2];
        Cities italianCapital = new Cities("Rome");
        Cities frenchCapital = new Cities("Paris");

        cities[0] = italianCapital.getName();
        cities[1] = frenchCapital.getName();



        ArrayList<String> newArrayListOfCities = new ArrayList(Arrays.asList(cities));
        for (int i = 0; i < newArrayListOfCities.size(); i++) {
            System.out.println(newArrayListOfCities.get(i));
        }

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



}
