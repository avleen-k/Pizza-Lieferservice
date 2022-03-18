package projekt.food;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class PizzaImpl implements Pizza{
    private BigDecimal price;
    private double weight;
    private Pizza.Variant<?,?> foodVariant;
    private  List<? extends Extra<?>> extras;
    private double diameter;
    private String sauce;

    /**
 constructor
 @param price, sets the value of price
 @param weight, sets the value of weight
 @param foodVariant, sets the value of foodVariant
 @param extras, sets the value of extras
 @param diameter, sets the value of diameter
  @param sauce, sets the value of sauce
  */
    public PizzaImpl(BigDecimal price, double weight, Pizza.Variant<?,?> foodVariant, List<? extends Extra<?>> extras, double diameter, String sauce)
    {
        this.price = price;
        this.weight = weight;
        this.foodVariant = foodVariant;
        this.extras = extras;
        this.diameter = diameter;
        this.sauce = sauce;
    }
    @Override
    /**
    @return the value of price
     */
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    /**
    @return the value of weight
     */
    public double getWeight() {
        return weight;
    }

    @Override
    /**
    @return the value of foodVariant
     */
    public Food.Variant<?, ?> getFoodVariant() {
        return foodVariant;
    }

    @Override
    /**
    @return the value of extras
     */
    public List<? extends Extra<?>> getExtras() {
        return extras;
    }

    @Override
    /**
    @return the value of diameter
     */
    public double getDiameter() {
        return diameter;
    }

    @Override
    /**
    @return the value of sauce
     */
    public String getSauce() {
        return sauce;
    }

    private static class StaticPizzaImpl implements  Pizza.Config, Saucable.Config{

        private UnaryOperator<BigDecimal> priceMutator;
        private DoubleUnaryOperator weightMutator;
        private UnaryOperator<String> sauceMutator;
        private DoubleUnaryOperator diameter;

        @Override
         /**
        the apply method of the UnaryOperator both accepts and returns a BigDecimal
        @param priceMutator
         */
        public void price(UnaryOperator<BigDecimal> priceMutator) {
           // priceMutator.apply((BigDecimal) priceMutator);
            this.priceMutator = (UnaryOperator<BigDecimal>) this.priceMutator.andThen(priceMutator);
        }

        @Override
        /**
        @return the value of priceMutator
         */
        public UnaryOperator<BigDecimal> getPriceMutator() {
            return this.priceMutator;
        }

        @Override
        /**
        the apply method of the DoubleUnaryOperator both accepts and returns the value of weightMutator
        @param weightMutator
         */
        public void weight(DoubleUnaryOperator weightMutator) {
                this.weightMutator = (DoubleUnaryOperator) this.weightMutator.andThen(weightMutator);
        }

        @Override
        /**
        @return the value of weightMutator
         */
        public DoubleUnaryOperator getWeightMutator() {
            return this.weightMutator;
        }

        @Override
        /**
        the apply method of the UnaryOperator both accepts and returns a string
        @param pobjUnaryOperator
         */
        public void sauce(UnaryOperator<String> pobjUnaryOperator) {
            //pobjUnaryOperator.apply(String.valueOf(pobjUnaryOperator));
            this.sauceMutator = (UnaryOperator<String>) this.sauceMutator.andThen(pobjUnaryOperator);
        }

        @Override
        /**
        @return the value of sauceMutator
         */
        public UnaryOperator<String> getSauceMutator() {
            return this.sauceMutator;
        }

        @Override
          /**
        the apply method of the DoubleUnaryOperator both accepts and returns the value of diameter
        @param pobjDoubleUnaryOperator
         */
        public void diameter(DoubleUnaryOperator pobjDoubleUnaryOperator) {
            this.diameter = (DoubleUnaryOperator) this.diameter.andThen(pobjDoubleUnaryOperator);
        }

        @Override
        /**
        @return the value of diameter
         */
        public DoubleUnaryOperator getDiameterMutator() {
            return this.diameter;
        }

    }

    /**
     * Definition of the margherita pizza variant
     */
    static class MargheritaVariant implements Saucable.Variant, Pizza.Variant {

        @Override
        public String getName() {
            return "Margherita";
        }

        @Override
        public FoodType getFoodType() {
            return FoodTypes.PIZZA;
        }

        @Override
        public BigDecimal getBasePrice() {
            return BigDecimal.valueOf(9.75);
        }

        @Override
        public double getBaseWeight() {
            return 0.8;
        }

        @Override
        public Food.Config createEmptyConfig() {
            return new StaticPizzaImpl();
        }

        @Override
        public Food create(List list) {
            return BUILDER.build((Pizza.Config) this.createEmptyConfig(), this, list);
        }

        @Override
        public double getBaseDiameter() {
            return 30.0;
        }

        @Override
        public String getBaseSauce() {
            return "Tomato";
        }
    }

    /**
     * Definition of the hawaii pizza variant
     */
    static class HawaiiVariant implements Saucable.Variant, Pizza.Variant {

        @Override
        public String getName() {
            return "Hawaii";
        }

        @Override
        public FoodType getFoodType() {
            return FoodTypes.PIZZA;
        }

        @Override
        public BigDecimal getBasePrice() {
            return BigDecimal.valueOf(13.75);
        }

        @Override
        public double getBaseWeight() {
            return 1.0;
        }

        @Override
        public Food.Config createEmptyConfig() {
            return new StaticPizzaImpl();
        }

        @Override
        public Food create(List list) {
            return BUILDER.build((Pizza.Config) this.createEmptyConfig(), this, list);
        }

        @Override
        public double getBaseDiameter() {
            return 30.0;
        }

        @Override
        public String getBaseSauce() {
            return "Tomato";
        }
    }

    /**
     * Definition of the rucola pizza variant
     */
    static class RucolaVariant implements Saucable.Variant, Pizza.Variant {

        @Override
        public String getName() {
            return "Rucola";
        }

        @Override
        public FoodType getFoodType() {
            return FoodTypes.PIZZA;
        }

        @Override
        public BigDecimal getBasePrice() {
            return BigDecimal.valueOf(14.50);
        }

        @Override
        public double getBaseWeight() {
            return 0.9;
        }

        @Override
        public Food.Config createEmptyConfig() {
            return new StaticPizzaImpl();
        }

        @Override
        public Food create(List list) {
            return BUILDER.build((Pizza.Config) this.createEmptyConfig(), this, list);
        }

        @Override
        public double getBaseDiameter() {
            return 30.0;
        }

        @Override
        public String getBaseSauce() {
            return "Tomato";
        }
    }

    /**
     * Definition of the BBQ pizza variant
     */
    static class BBQVariant implements Saucable.Variant, Pizza.Variant {

        @Override
        public String getName() {
            return "BBQ";
        }

        @Override
        public FoodType getFoodType() {
            return FoodTypes.PIZZA;
        }

        @Override
        public BigDecimal getBasePrice() {
            return BigDecimal.valueOf(14.50);
        }

        @Override
        public double getBaseWeight() {
            return 1.1;
        }

        @Override
        public Food.Config createEmptyConfig() {
            return new StaticPizzaImpl();
        }

        @Override
        public Food create(List list) {
            return BUILDER.build((Pizza.Config) this.createEmptyConfig(), this, list);
        }

        @Override
        public double getBaseDiameter() {
            return 30.0;
        }

        @Override
        public String getBaseSauce() {
            return "BBQ";
        }
    }
}
