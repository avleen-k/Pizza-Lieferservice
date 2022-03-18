package projekt.food;

import java.util.function.DoubleUnaryOperator;

public interface Pasta extends Saucable {
    double getThickness();

    interface Config extends Saucable.Config {
        void thickness(DoubleUnaryOperator pobjDoubleUnaryOperator);

        DoubleUnaryOperator getThicknessMutator();
    }

    interface Variant extends Saucable.Variant {
        double getBaseThickness();
    }
    //H.11
    FoodBuilder<Pasta,Config, Variant> BUILDER= (config, variant, extras) ->
        new PastaImpl(variant.getBasePrice(),variant.getBaseWeight(),variant,extras, variant.getBaseThickness(), variant.getBaseSauce());
}
