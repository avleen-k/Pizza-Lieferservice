package projekt.food;

import java.util.function.UnaryOperator;

public interface Saucable extends Food {

    /**
     * Getter Method returning the value of the current sauce
     * @return string value containing information about the sauce
     */
    String getSauce();

    /**
     * Definition of the Saucable.Config interface
     */
    interface Config extends Food.Config {
        /**
         * Method to introduce a new function to the current one that manipulates the sauce string value
         * @param pobjUnaryOperator new function that will be combined with the existing one
         */
        void sauce(UnaryOperator<String> pobjUnaryOperator);

        /**
         * Getter method for the composition of functions that manipulate the sauce string value
         * @return UnaryOperator of type string or function composition
         */
        UnaryOperator<String> getSauceMutator();

    }

    interface Variant extends Food.Variant {
        /**
         * Getter method that returns information about the base sauce of the food variant
         * @return string value defining the base sauce
         */
        String getBaseSauce();
    }
}
