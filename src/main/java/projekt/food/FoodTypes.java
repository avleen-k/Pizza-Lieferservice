package projekt.food;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class FoodTypes {

   public static FoodType<Saucable, Saucable.Config> pizza; // = new FoodTypeImpl("Pizza", );
      //  private List<? extends Extra<? super Food.Config>> listPizza = {};
    public static FoodType<Saucable, Saucable.Config> pasta;
        //private List<? extends Extra<? super Food.Config>> listPasta = {};
    public static FoodType<Food, Food.Config> iceCream;
        // private List<? extends Extra<? super Food.Config>> listIceCream = {};
    public static Map<Food, Food.Config> ALL; // = new HashMap<Food, Food.Config>;
    static {
        ALL = new HashMap<>();
       // ALL.put(pizza, listPizza);
       // ALL.put(pasta, listPasta);
       // ALL.put(iceCream, listIceCream);
    }

    static Food.Variant initializer;

}
