package projekt.food;

import java.util.function.DoubleUnaryOperator;

public interface Pasta extends Saucable {
    /**
     * Getter method returning information about the thickness of the pasta
     * @return double value containing the thickness of the pasta
     */
    double getThickness();

    /**
     * Definition of the Pasta.Config interface
     */
    interface Config extends Saucable.Config {
        /**
         * Method for introducing a new function to the composition that manipulates the thickness attribute value
         * @param pobjDoubleUnaryOperator new function that is to be introduced
         */
        void thickness(DoubleUnaryOperator pobjDoubleUnaryOperator);

        /**
         * Getter method for the current function composition that manipulates the thickness attribute value
         * @return DoubleUnaryOperator function composition
         */
        DoubleUnaryOperator getThicknessMutator();
    }

    interface Variant<T,T1> extends Saucable.Variant {
        /**
         * Getter method that returns information about the base thickness of the food variant
         * @return double value defining the base thickness
         */
        double getBaseThickness();
    }
    //H.11
    FoodBuilder<Pasta,Config, Variant> BUILDER= (config, variant, extras) ->
        new PastaImpl(variant.getBasePrice(),variant.getBaseWeight(),variant,extras, variant.getBaseThickness(), variant.getBaseSauce());
}
