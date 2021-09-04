package hw1;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

   private List<T> object;


    public Box(ArrayList<T> object) {
        this.object = object;
    }

    protected Fruit addFruitToTheBox(Fruit fruit) {
        return fruit;
    }

    public void showType() {
        System.out.println("Тип T: " + object.getClass().getName());
    }



}
