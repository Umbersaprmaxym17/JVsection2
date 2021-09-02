package hw1;

import java.util.ArrayList;
import java.util.List;

public class MainForFruits {

    public static void main(String[] args) {


        Box <Apple>appleBox = new Box(null);
        Box <Orange>orangeBox = new Box(null);





        List<Apple> appleArrayList = new ArrayList<>();
        appleArrayList.add(new Apple(2));
        appleArrayList.add(new Apple(1));
        appleArrayList.add(new Apple(3));
        appleArrayList.add(new Apple(5));

        List<Orange> orangeArrayList = new ArrayList<>();
        orangeArrayList.add(new Orange(6));
        orangeArrayList.add(new Orange(4));
        orangeArrayList.add(new Orange(7));
        orangeArrayList.add(new Orange(8));


    }
}
