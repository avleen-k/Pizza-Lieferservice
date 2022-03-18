package projekt.food;

import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;


public final class Extras {
    private static Consumer<Food.Config> extraHam = new Consumer<Food.Config>() {

        Food.Config config = new Food.Config() {
            @Override
            public void price(UnaryOperator<BigDecimal> priceMutator) {

            }

            @Override
            public UnaryOperator<BigDecimal> getPriceMutator() {
                return null;
            }

            @Override
            public void weight(DoubleUnaryOperator weightMutator) {

            }

            @Override
            public DoubleUnaryOperator getWeightMutator() {
                return null;
            }
        };

        @Override
        public void accept(Food.Config config) {

        }
    };
    public static final Extra<Pizza.Config> EXTRA_HAM = new ExtraImpl("Extra Ham", 5, extraHam);

    private static Consumer<Food.Config> extraOlives = new Consumer<Food.Config>() {

        Food.Config config = new Food.Config() {
            @Override
            public void price(UnaryOperator<BigDecimal> priceMutator) {

            }

            @Override
            public UnaryOperator<BigDecimal> getPriceMutator() {
                return null;
            }

            @Override
            public void weight(DoubleUnaryOperator weightMutator) {

            }

            @Override
            public DoubleUnaryOperator getWeightMutator() {
                return null;
            }
        };

        @Override
        public void accept(Food.Config config) {

        }
    };
    public static final Extra<Pizza.Config> EXTRA_OLIVES = new ExtraImpl("Extra Olives", 5, extraOlives);

    private static Consumer<Food.Config> extraThick = new Consumer<Food.Config>() {

        Food.Config config = new Food.Config() {
            @Override
            public void price(UnaryOperator<BigDecimal> priceMutator) {

            }

            @Override
            public UnaryOperator<BigDecimal> getPriceMutator() {
                return null;
            }

            @Override
            public void weight(DoubleUnaryOperator weightMutator) {

            }

            @Override
            public DoubleUnaryOperator getWeightMutator() {
                return null;
            }
        };

        @Override
        public void accept(Food.Config config) {

        }
    };
    public static final Extra<Pasta.Config> EXTRA_THICK = new ExtraImpl("Extra Thick", 4, extraThick);

    private static Consumer<Food.Config> spicySauce = new Consumer<Food.Config>() {

        Food.Config config = new Food.Config() {
            @Override
            public void price(UnaryOperator<BigDecimal> priceMutator) {

            }

            @Override
            public UnaryOperator<BigDecimal> getPriceMutator() {
                return null;
            }

            @Override
            public void weight(DoubleUnaryOperator weightMutator) {

            }

            @Override
            public DoubleUnaryOperator getWeightMutator() {
                return null;
            }
        };

        @Override
        public void accept(Food.Config config) {

        }
    };
    public static final Extra<Saucable.Config> SPICY_SAUCE = new ExtraImpl("Spicy Sauce ", 4, spicySauce);

    private static Consumer<Food.Config> extraSauce = new Consumer<Food.Config>() {

        Food.Config config = new Food.Config() {
            @Override
            public void price(UnaryOperator<BigDecimal> priceMutator) {

            }

            @Override
            public UnaryOperator<BigDecimal> getPriceMutator() {
                return null;
            }

            @Override
            public void weight(DoubleUnaryOperator weightMutator) {

            }

            @Override
            public DoubleUnaryOperator getWeightMutator() {
                return null;
            }
        };

        @Override
        public void accept(Food.Config config) {

        }
    };
    public static final Extra<Saucable.Config> EXTRA_SAUCE = new ExtraImpl("Extra Sauce ", 4, extraSauce);

    private static Consumer<Food.Config> noSauce = new Consumer<Food.Config>() {

        Food.Config config = new Food.Config() {
            @Override
            public void price(UnaryOperator<BigDecimal> priceMutator) {

            }

            @Override
            public UnaryOperator<BigDecimal> getPriceMutator() {
                return null;
            }

            @Override
            public void weight(DoubleUnaryOperator weightMutator) {

            }

            @Override
            public DoubleUnaryOperator getWeightMutator() {
                return null;
            }
        };

        @Override
        public void accept(Food.Config config) {

        }
    };
    public static final Extra<Saucable.Config> NO_SAUCE = new ExtraImpl("No Sauce ", 5, noSauce);

    private static Consumer<Food.Config> rainbowSprinkles = new Consumer<Food.Config>() {

        Food.Config config = new Food.Config() {
            @Override
            public void price(UnaryOperator<BigDecimal> priceMutator) {

            }

            @Override
            public UnaryOperator<BigDecimal> getPriceMutator() {
                return null;
            }

            @Override
            public void weight(DoubleUnaryOperator weightMutator) {

            }

            @Override
            public DoubleUnaryOperator getWeightMutator() {
                return null;
            }
        };

        @Override
        public void accept(Food.Config config) {

        }
    };
    public static final Extra<IceCream.Config> RAINBOW_SPRINKLES = new ExtraImpl("Rainbow Sprinkles", 5, rainbowSprinkles);

    private static Consumer<Food.Config> extraScoop = new Consumer<Food.Config>() {

        Food.Config config = new Food.Config() {
            @Override
            public void price(UnaryOperator<BigDecimal> priceMutator) {

            }

            @Override
            public UnaryOperator<BigDecimal> getPriceMutator() {
                return null;
            }

            @Override
            public void weight(DoubleUnaryOperator weightMutator) {

            }

            @Override
            public DoubleUnaryOperator getWeightMutator() {
                return null;
            }
        };

        @Override
        public void accept(Food.Config config) {

        }
    };
    public static final Extra<IceCream.Config> EXTRA_SCOOP = new ExtraImpl("Extra Scoop", 2, extraScoop);

    //public static final Map<String, Extra<?>> ALL;






}
