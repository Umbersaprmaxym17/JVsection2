package hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends List> {

   private T[] object;



    public Box(T[] object) {

        this.object = object;


    }

    public void setObject(T[] object) {
        this.object = object;
    }

    public T[] getObject() {
        return object;
    }

    public void showTypes() {
        System.out.println("Тип T: " + object.getClass().getName());
    }








    public void getBoxWeight() {
//        Сделать метод getWeight(),
//        который высчитывает вес коробки,
//        зная вес одного фрукта и их количество:
//        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

    }

    public void compare() {
//        сделать метод compare(),
//        который позволяет сравнить текущую коробку с той,
//        которую подадут в compare() в качестве параметра.
//        true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
    }







}
