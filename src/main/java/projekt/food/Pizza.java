package projekt.food;

import java.util.function.DoubleUnaryOperator;

public interface Pizza extends Saucable {
    /**
     * Getter method returning the diameter of the pizza
     * @return double value defining the diameter
     */
    double getDiameter();

    /**
     * Definition for the Pizza.Config interface
     */
    interface Config extends Saucable.Config {
        /**
         * Method for introducing a new function to the current function composition manipulating the diameter value
         * @param pobjDoubleUnaryOperator double function to add to current composition
         */
        void diameter(DoubleUnaryOperator pobjDoubleUnaryOperator);

        /**
         * Getter method returning the current function composition for manipulating the diameter value
         * @return current function composition
         */
        DoubleUnaryOperator getDiameterMutator();
    }

    interface Variant<T,T1> extends Saucable.Variant {
        double getBaseDiameter();
    }
    //H2.11
    FoodBuilder<Pizza, Pizza.Config, Pizza.Variant> BUILDER= (config, variant, extras) ->
        new PizzaImpl(variant.getBasePrice(),variant.getBaseWeight(),variant,extras, variant.getBaseDiameter(), variant.getBaseSauce());
}
