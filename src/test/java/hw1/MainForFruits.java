package hw1;

import java.util.ArrayList;
import java.util.List;

public class MainForFruits {

    public static void main(String[] args) {


        Apple apple1 = new Apple(3);
        Apple apple2 = new Apple(3);


        Orange orange1 = new Orange(2);
        Orange orange2 = new Orange(2);


        List orangeBoxList = new ArrayList<>();
        orangeBoxList.add(orange1.getWeight());
        orangeBoxList.add(orange2.getWeight());
        System.out.println(" Orange Box List "+ orangeBoxList.get(0));



        List appleBoxList = new ArrayList();
        appleBoxList.add(apple1.getWeight());
        appleBoxList.add(apple2.getWeight());
        System.out.println(" Apple Box List "+ appleBoxList.get(0));
        System.out.println("***************************************");
//        System.out.println(getWeight(appleBoxList));
        Integer box1 = getWeight(appleBoxList);

        System.out.println("***************************************");
//        System.out.println(getWeight(orangeBoxList));
        Integer box2 = getWeight(orangeBoxList);


    }

    public static Integer getWeight(List arrayList) {
        int totalFruitsWeight = 0;
        int numberOfFruits = arrayList.size();
        int fruitWeight = (int) arrayList.get(0);
        totalFruitsWeight = fruitWeight * numberOfFruits;
        return totalFruitsWeight;
    }


    public static Integer compare() {
        return null;
    }





}
