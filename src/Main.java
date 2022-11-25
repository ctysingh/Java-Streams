import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        var dishes = GetDishes();
        for (Dish dish: dishes   ) {
            System.out.println(dish.getName());
        }

        // get vegetarian dishes
       List<String> vegDishes = dishes.stream()
                .filter(d -> d.isVegetarian())
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println("List fo vegetarian dishes");

        for ( String name: vegDishes ) {
            System.out.println(name);
        }
        System.out.println("List of high calories dishes");
        // get the dishes with calories more than 300
        List<String > highCalories = dishes.stream()
                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .collect(Collectors.toList());

        for (String name: highCalories  ) {
            System.out.println(name);
        }

    }

    private static List<Dish> GetDishes() {
        return Arrays.asList(
                new Dish("pork", false,800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 400, Type.OTHER),
                new Dish("rice", true, 300, Type.OTHER),
                new Dish("seasoned fruit", true, 200, Type.OTHER),
                new Dish("pizza", true, 700, Type.OTHER),
                new Dish("prawns", false, 600, Type.FISH),
                new Dish("salmom", false, 450, Type.FISH),
                new Dish("Dal", true, 250, Type.OTHER),
                new Dish("curd rice", true, 245, Type.OTHER)
        );
    }
}