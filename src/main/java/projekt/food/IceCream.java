package projekt.food;

import java.util.List;
import java.util.function.UnaryOperator;

public interface IceCream extends Food {
    String getFlavor();

    interface Config extends Food.Config {
        void flavor(UnaryOperator<String> pobjUnaryOperator);

        UnaryOperator<String> getFlavorMutator();
    }

    interface Variant<T, T1> extends Food.Variant {
        String getBaseFlavor();
    }
    //H2.11
    FoodBuilder<IceCream,Config,Variant> BUILDER= (config, variant, extras) ->
        new IceCreamImpl(variant.getBasePrice(),variant.getBaseWeight(),variant,extras,variant.getBaseFlavor());
}
