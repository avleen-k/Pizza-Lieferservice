package projekt.food;

import java.util.List;
import java.util.Map;

public final class FoodTypes {

   public static FoodType<Saucable, Saucable.Config> pizza; // = new FoodTypeImpl("Pizza", );
     //   private List<? extends Extra<? super Food.Config>> list = {};
    public static FoodType<Saucable, Saucable.Config> pasta;
    public static FoodType<Food, Food.Config> iceCream;
    public static Map ALL;
}
