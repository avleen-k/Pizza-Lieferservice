package projekt.food;

import java.util.ArrayList;
import java.util.List;

public class FoodTypeImpl<F extends Food, C extends Food.Config> implements FoodType{
    private final String name;
    private final List<? extends Extra<? super C>> compatibleExtras;
    private final List<Food.Variant<F, C>> foodVariants = new ArrayList<Food.Variant<F, C>>();

    /**
     * Constructor for class FoodTypeImpl.This class implements the generic Interface FoodType
     * @param name type String , The name of the food
     * @param compatibleExtras type List<? extends Extra<? super C>> The list of the compatible Extras for
     *                         that category of food.
     */
    public FoodTypeImpl(String name, List<? extends Extra<? super C>> compatibleExtras) {
        this.name = name;
        this.compatibleExtras = compatibleExtras;
        }

    /**
     * The name of this food type.
     *
     * <p>
     * This may be something similar to {@code "Pizza"}.
     * </p>
     *
     * @return The name of this type
     */
    @Override
    public String getName() {
        return null;
    }

    /**
     * Adds a {@link Food.Variant} to this food type.
     *
     * @param variant The {@link Food.Variant} to add to this food type
     */
    @Override
    public void addFoodVariant(Food.Variant variant) {

    }

    /**
     * getter method getCompatibleExtras
     * @return the current compatible extra
     */
    public List<? extends Extra<? super C>> getCompatibleExtras() {
        return this.compatibleExtras;
    }

    /**
     * getter method getFoodVariants
     * @return the current food variant
     */
    public List<Food.Variant<F, C>> getFoodVariants() {
        return this.foodVariants;
    }






}
