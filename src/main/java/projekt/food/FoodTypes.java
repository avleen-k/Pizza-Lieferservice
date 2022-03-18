package projekt.food;

import java.util.*;

public final class FoodTypes {


    private static  List<? extends Extra<? super Food.Config>> listPizza = (List<? extends Extra<? super Food.Config>>) Arrays.asList(Extras.EXTRA_HAM,Extras.EXTRA_OLIVES,Extras.SPICY_SAUCE, Extras.EXTRA_SAUCE, Extras.NO_SAUCE);

    public static FoodType<Saucable, Saucable.Config> PIZZA = new FoodTypeImpl("Pizza",listPizza );

    private static List<? extends Extra<? super Food.Config>> listPasta = (List<? extends Extra<? super Food.Config>>) Arrays.asList(Extras.EXTRA_THICK, Extras.SPICY_SAUCE, Extras.EXTRA_SAUCE, Extras.NO_SAUCE);
    public static FoodType<Saucable, Saucable.Config> PASTA = new FoodTypeImpl("Pasta", listPasta);

     private static List<? extends Extra<? super Food.Config>> listIceCream = (List<? extends Extra<? super Food.Config>>) Arrays.asList(Extras.RAINBOW_SPRINKLES, Extras.EXTRA_SCOOP);
    public static FoodType<Food, Food.Config> ICE_CREAM = new FoodTypeImpl("IceCream", listIceCream);

    public static Map<Food, Food.Config> ALL;

    /*
    set keys to the Map
     */
    static {
        ALL = new HashMap<>();
        ALL.put((Food) PIZZA, (Food.Config)listPizza);
        ALL.put((Food) PASTA, (Food.Config)listPasta);
        ALL.put((Food) ICE_CREAM, (Food.Config)listIceCream);


    }

    static Food.Variant initializer;

}
