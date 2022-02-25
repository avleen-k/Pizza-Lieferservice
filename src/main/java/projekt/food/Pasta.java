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
}
