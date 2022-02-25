package projekt.food;

import java.util.function.UnaryOperator;

public interface Saucable extends Food {
    String getSauce();

    interface Config extends Food.Config {
        void sauce(UnaryOperator<String> pobjUnaryOperator);

        UnaryOperator<String> getSauceMutator();

    }

    interface Variant extends Food.Variant {
        String getBaseSauce();
    }
}
