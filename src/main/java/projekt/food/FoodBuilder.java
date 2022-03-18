package projekt.food;

import java.util.List;

@FunctionalInterface
public interface FoodBuilder<F extends Food,C extends Food.Config,V extends Food.Variant> {
    /**
     * A method used later to create Food object to generate a configured dish.
     * @param c Config
     * @param v Variant
     * @param extras List of Extras
     * @return Food object
     */
    F build(C c, V v, List<? extends Extra> extras);

}
