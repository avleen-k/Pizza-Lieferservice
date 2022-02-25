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
}
