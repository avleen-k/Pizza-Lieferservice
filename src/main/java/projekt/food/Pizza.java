package projekt.food;

import java.util.function.DoubleUnaryOperator;

public interface Pizza extends Saucable {
    double getDiameter();

    interface Config extends Saucable.Config {
        void diameter(DoubleUnaryOperator pobjDoubleUnaryOperator);

        DoubleUnaryOperator getDiameterMutator();
    }

    interface Variant extends Saucable.Variant {
        double getBaseDiameter();
    }
    //H2.11
    FoodBuilder<Pizza, Pizza.Config, Pizza.Variant> BUILDER= (config, variant, extras) ->
        new PizzaImpl(variant.getBasePrice(),variant.getBaseWeight(),variant,extras, variant.getBaseDiameter(), variant.getBaseSauce());
}
