package projekt.food;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;


public final class Extras {

    private Extras(){}

    public static final Extra<Pizza.Config> EXTRA_HAM = new ExtraImpl<>("Extra Ham", 5, config -> {
        UnaryOperator<BigDecimal> unaryOperator = x -> x.add(new BigDecimal(1));
        config.price(unaryOperator);
        DoubleUnaryOperator doubleUnaryOperator = x -> x + 0.1;
        config.weight(doubleUnaryOperator);
    });

    public static final Extra<Pizza.Config> EXTRA_OLIVES = new ExtraImpl<>("Extra Olives", 5, config -> {
        UnaryOperator<BigDecimal> unaryOperator = x -> x.add(new BigDecimal(0.8));
        config.price(unaryOperator);
        DoubleUnaryOperator doubleUnaryOperator = x -> x + 0.05;
        config.weight(doubleUnaryOperator);
    });

    public static final Extra<Pasta.Config> EXTRA_THICK = new ExtraImpl<>("Extra Thick", 4, config -> {
        UnaryOperator<BigDecimal> unaryOperator = x -> x.add(new BigDecimal(4));
        config.price(unaryOperator);
        DoubleUnaryOperator doubleUnaryOperator = x -> x * 2;
        config.weight(doubleUnaryOperator);
        config.thickness(doubleUnaryOperator);
    });

    public static final Extra<Saucable.Config> SPICY_SAUCE = new ExtraImpl<>("Spicy Sauce ", 4, config -> {
        UnaryOperator<BigDecimal> unaryOperator = x -> x.add(new BigDecimal(0.5));
        config.price(unaryOperator);
        UnaryOperator<String> stringUnaryOperator = x -> "Spicy ";
        config.sauce(stringUnaryOperator);
    });

    public static final Extra<Saucable.Config> EXTRA_SAUCE = new ExtraImpl<>("Extra Sauce ", 4, config -> {
        UnaryOperator<BigDecimal> unaryOperator = x -> x.add(new BigDecimal(1.25));
        config.price(unaryOperator);
        DoubleUnaryOperator doubleUnaryOperator = x -> x + 0.12;
        config.weight(doubleUnaryOperator);
        UnaryOperator<String> stringUnaryOperator = x -> "Extra ";
        config.sauce(stringUnaryOperator);
    });

    public static final Extra<Saucable.Config> NO_SAUCE = new ExtraImpl<>("No Sauce ", 5, config -> {
        UnaryOperator<BigDecimal> unaryOperator = x -> {
            if (x.subtract(new BigDecimal(1)).compareTo(new BigDecimal(0)) == -1)
                return new BigDecimal(0);
            else
                return x.subtract(new BigDecimal(1));
        };
        config.price(unaryOperator);
        DoubleUnaryOperator doubleUnaryOperator = x -> {
            if (x - 0.1 < 0) return 0;
            else return x - 0.1;
        };
        config.weight(doubleUnaryOperator);
        UnaryOperator<String> stringUnaryOperator = x -> null;
        config.sauce(stringUnaryOperator);
    });

    public static final Extra<IceCream.Config> RAINBOW_SPRINKLES = new ExtraImpl<>("Rainbow Sprinkles", 5, config -> {
        UnaryOperator<BigDecimal> unaryOperator = x -> x.add(new BigDecimal(0.5));
        config.price(unaryOperator);
        DoubleUnaryOperator doubleUnaryOperator = x -> x + 0.03;
        config.weight(doubleUnaryOperator);
    });

    public static final Extra<IceCream.Config> EXTRA_SCOOP = new ExtraImpl<>("Extra Scoop", 2, config -> {
        UnaryOperator<BigDecimal> unaryOperator = x -> x.add(new BigDecimal(3));
        config.price(unaryOperator);
        DoubleUnaryOperator doubleUnaryOperator = x -> x + 0.1;
        config.weight(doubleUnaryOperator);
    });
    public static final Extra<IceCream.Config> FRESH_BERRIES = new ExtraImpl<>("Extra Scoop", 2, config -> {
        UnaryOperator<BigDecimal> unaryOperator = x -> x.add(new BigDecimal(1.5));
        config.price(unaryOperator);
        DoubleUnaryOperator doubleUnaryOperator = x -> x + 1;
        config.weight(doubleUnaryOperator);
    });

    public static final Map<String, Extra<?>> ALL = new HashMap<>() {
        {
            put("EXTRA_HAM", EXTRA_HAM);
            put("EXTRA_OLIVES", EXTRA_OLIVES);
            put("EXTRA_THICK", EXTRA_THICK);
            put("SPICY_SAUCE", SPICY_SAUCE);
            put("EXTRA_SAUCE", EXTRA_SAUCE);
            put("NO_SAUCE", NO_SAUCE);
            put("RAINBOW_SPRINKLES", RAINBOW_SPRINKLES);
            put("EXTRA_SCOOP", EXTRA_SCOOP);
            put("FRESH_BERRIES", FRESH_BERRIES);
        }
    };

}
