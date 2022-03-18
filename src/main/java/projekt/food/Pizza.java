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
        void diameter(DoubleUnaryOperator pobjDoubleUnaryOperator);

        DoubleUnaryOperator getDiameterMutator();
    }

    interface Variant<T,T1> extends Saucable.Variant {
        double getBaseDiameter();
    }
    //H2.11
    FoodBuilder<Pizza, Pizza.Config, Pizza.Variant> BUILDER= (config, variant, extras) ->
        new PizzaImpl(variant.getBasePrice(),variant.getBaseWeight(),variant,extras, variant.getBaseDiameter(), variant.getBaseSauce());
}
