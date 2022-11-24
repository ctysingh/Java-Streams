import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Dish> dishes = Arrays.asList(
                new Dish("pork", false,800, Type.MEAT),
                new Dish(("beef", false, 700, Type.MEAT)),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 400, Type.OTHER),
                new Dish("rice", true, 300, Type.OTHER),
                new Dish("seasoned fruit", true, 200, Type.OTHER),
                new Dish("pizza", true, 700, Type.OTHER),
                new Dish("prawns", false, 600, Type.FISH),
                new Dish("salmom", false, 450, Type.FISH),
        );



    }
}