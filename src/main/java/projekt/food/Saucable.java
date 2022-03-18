package projekt.food;

import java.util.function.UnaryOperator;

public interface Saucable extends Food {

    /**
     * Getter Method returning the value of the current sauce
     * @return string value containing information about the sauce
     */
    String getSauce();

    interface Config extends Food.Config {

        void sauce(UnaryOperator<String> pobjUnaryOperator);


        UnaryOperator<String> getSauceMutator();

    }

    interface Variant extends Food.Variant {

        String getBaseSauce();
    }
}
