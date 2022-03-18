package projekt.food;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class IceCreamImpl implements IceCream{

    private BigDecimal price;
    private double weight;
    private Variant<?,?> foodVariant;
    private  List<? extends Extra<?>> extras;
    private String flavor;

    /**
    constructor
    @param price, sets the value of price
    @param weight, sets the value of weight
    @param foodVariant, sets the value of foodVariant
    @param extras, sets the value of extras
    @param flavor, sets the value of flavor
     */
    public IceCreamImpl(BigDecimal price, double weight, Variant<?,?> foodVariant, List<? extends Extra<?>> extras, String flavor)
    {
        this.price = price;
        this.weight = weight;
        this.foodVariant = foodVariant;
        this.extras = extras;
        this.flavor = flavor;
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
    public Variant<?,?> getFoodVariant() {
        return foodVariant;
    }

    @Override
    /**
    @return the value of extras
     */
    public List<? extends Extra<?>> getExtras() {
        return extras;
    }

    /**
    @return the value of flavor
     */
    public String getFlavor()
    {
        return flavor;
    }

    private static class StaticIceCreamImpl implements Food.Config, IceCream.Config
    {
            private UnaryOperator<BigDecimal> priceMutator;
            private DoubleUnaryOperator weightMutator;
            private UnaryOperator<String> flavorMutator;

        @Override
         /**
        the apply method of the UnaryOperator both accepts and returns a BigDecimal
        @param priceMutator
         */
        public void price(UnaryOperator<BigDecimal> priceMutator) {
            //priceMutator.apply((BigDecimal) priceMutator);
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
        @param priceMutator
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
        the apply method of the UnaryOperator both accepts and returns a String
        @param pobjUnaryOperator
         */
        public void flavor(UnaryOperator<String> pobjUnaryOperator) {
           // pobjUnaryOperator.apply(String.valueOf(pobjUnaryOperator));
            this.flavorMutator = (UnaryOperator<String>) this.flavorMutator.andThen(pobjUnaryOperator);
        }

        @Override
         /**
        @return the value of flavorMutator
         */
        public UnaryOperator<String> getFlavorMutator() {
            return this.flavorMutator;
        }
    }

    /**
     * Definition of the vanilla ice cream variant
     */
    static class VanillaVariant implements Food.Variant, IceCream.Variant {

        @Override
        public String getName() {
            return "Vanilla";
        }

        @Override
        public FoodType getFoodType() {
            return FoodTypes.ICE_CREAM;
        }

        @Override
        public BigDecimal getBasePrice() {
            return BigDecimal.valueOf(1.5);
        }

        @Override
        public double getBaseWeight() {
            return 0.2;
        }

        @Override
        public Food.Config createEmptyConfig() {
            return new StaticIceCreamImpl();
        }

        @Override
        public Food create(List list) {
            return BUILDER.build((IceCream.Config) this.createEmptyConfig(), this, list);
        }

        @Override
        public String getBaseFlavor() {
            return "Vanilla";
        }
    }

    /**
     * Definition of the strawberry ice cream variant
     */
    static class StrawberryVariant implements Food.Variant, IceCream.Variant {

        @Override
        public String getName() {
            return "Strawberry";
        }

        @Override
        public FoodType getFoodType() {
            return FoodTypes.ICE_CREAM;
        }

        @Override
        public BigDecimal getBasePrice() {
            return BigDecimal.valueOf(1.5);
        }

        @Override
        public double getBaseWeight() {
            return 0.2;
        }

        @Override
        public Food.Config createEmptyConfig() {
            return new StaticIceCreamImpl();
        }

        @Override
        public Food create(List list) {
            return BUILDER.build((IceCream.Config) this.createEmptyConfig(), this, list);
        }

        @Override
        public String getBaseFlavor() {
            return "Strawberry";
        }
    }

    /**
     * Definition of the chocolate ice cream variant
     */
    static class ChocolateVariant implements Food.Variant, IceCream.Variant {

        @Override
        public String getName() {
            return "Chocolate";
        }

        @Override
        public FoodType getFoodType() {
            return FoodTypes.ICE_CREAM;
        }

        @Override
        public BigDecimal getBasePrice() {
            return BigDecimal.valueOf(1.5);
        }

        @Override
        public double getBaseWeight() {
            return 0.2;
        }

        @Override
        public Food.Config createEmptyConfig() {
            return new StaticIceCreamImpl();
        }

        @Override
        public Food create(List list) {
            return BUILDER.build((IceCream.Config) this.createEmptyConfig(), this, list);
        }

        @Override
        public String getBaseFlavor() {
            return "Chocolate";
        }
    }

    /**
     * Definition for the stracciatella ice cream variant
     */
    static class StracciatellaVariant implements Food.Variant, IceCream.Variant {

        @Override
        public String getName() {
            return "Stracciatella";
        }

        @Override
        public FoodType getFoodType() {
            return FoodTypes.ICE_CREAM;
        }

        @Override
        public BigDecimal getBasePrice() {
            return BigDecimal.valueOf(1.5);
        }

        @Override
        public double getBaseWeight() {
            return 0.2;
        }

        @Override
        public Food.Config createEmptyConfig() {
            return new StaticIceCreamImpl();
        }

        @Override
        public Food create(List list) {
            return BUILDER.build((IceCream.Config) this.createEmptyConfig(), this, list);
        }

        @Override
        public String getBaseFlavor() {
            return "Stracciatella";
        }
    }
}
