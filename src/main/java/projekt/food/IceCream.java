package projekt.food;

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
}
