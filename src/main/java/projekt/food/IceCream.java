package projekt.food;

import java.util.List;
import java.util.function.UnaryOperator;

public interface IceCream extends Food {
    /**
     * Getter method returning information about the flavor of the ice cream
     * @return string value defining the flavor
     */
    String getFlavor();

    /**
     * Definition of the IceCream.Config interface
     */
    interface Config extends Food.Config {
        /**
         * Method for introducing a new function to the composition that manipulates the flavor attribute value
         * @param pobjUnaryOperator string function that should be added to the composition
         */
        void flavor(UnaryOperator<String> pobjUnaryOperator);

        /**
         * Getter method for the current function composition that manipulates the flavor attribute value
         * @return UnaryOperator of type string or string function composition
         */
        UnaryOperator<String> getFlavorMutator();
    }

    interface Variant<T, T1> extends Food.Variant {
        /**
         * Getter method that returns information about the base flavor of the food variant
         * @return string value defining the base flavor
         */
        String getBaseFlavor();
    }
    //H2.11
    FoodBuilder<IceCream,Config,Variant> BUILDER= (config, variant, extras) ->
        new IceCreamImpl(variant.getBasePrice(),variant.getBaseWeight(),variant,extras,variant.getBaseFlavor());
}
