package projekt.food;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class PastaImpl implements Pasta{
    private BigDecimal price;
    private double weight;
    private Pasta.Variant<?,?> foodVariant;
    private  List<? extends Extra<?>> extras;
    private double thickness;
    private String sauce;

    /**
   constructor
   @param price, sets the value of price
   @param weight, sets the value of weight
   @param foodVariant, sets the value of foodVariant
   @param extras, sets the value of extras
   @param thickness, sets the value of thickness
    @param sauce, sets the value of sauce
    */
    public PastaImpl(BigDecimal price, double weight, Pasta.Variant<?,?> foodVariant, List<? extends Extra<?>> extras, double thickness, String sauce)
    {
        this.price = price;
        this.weight = weight;
        this.foodVariant = foodVariant;
        this.extras = extras;
        this.thickness = thickness;
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
    @return the value of thickness
     */
    public double getThickness() {
        return thickness;
    }

    @Override
     /**
    @return the value of sauce
     */
    public String getSauce() {
        return sauce;
    }

    private static class StaticPastaImpl implements Saucable.Config, Pasta.Config
    {

        private UnaryOperator<String> sauceMutator;
        private DoubleUnaryOperator thicknessMutator;
        private UnaryOperator<BigDecimal> priceMutator;
        private DoubleUnaryOperator weightMutator;

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
         **/
        public UnaryOperator<BigDecimal> getPriceMutator() {
            return this.priceMutator;
        }

        @Override
        /**
        the apply method of the DoubleUnaryOperator both accepts and returns the value of weightMutator
        @param priceMutator
         */
        public void weight(DoubleUnaryOperator weightMutator) {
           // weightMutator.applyAsDouble(weightMutator.);
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
         //   pobjUnaryOperator.apply(String.valueOf(pobjUnaryOperator));
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
        the apply method of the DoubleUnaryOperator both accepts and returns the value of pobjDoubleUnaryOperator
        @param priceMutator
         */
        public void thickness(DoubleUnaryOperator pobjDoubleUnaryOperator) {
           // pobjDoubleUnaryOperator.applyAsDouble(pobjDoubleUnaryOperator);
            this.thicknessMutator = (DoubleUnaryOperator) this.thicknessMutator.andThen(pobjDoubleUnaryOperator);
        }

        @Override
         /**
        @return the value of thicknessMutator
         */
        public DoubleUnaryOperator getThicknessMutator() {
            return this.thicknessMutator;
        }
    }

    /**
     * Definition of the spaghetti pasta variant
     */
    static class SpaghettiVariant implements Saucable.Variant, Pasta.Variant {
        @Override
        public String getName() {
            return "Spaghetti";
        }

        @Override
        public FoodType getFoodType() {
            return FoodTypes.PASTA;
        }

        @Override
        public BigDecimal getBasePrice() {
            return BigDecimal.valueOf(12.5);
        }

        @Override
        public double getBaseWeight() {
            return 0.2;
        }

        @Override
        public Food.Config createEmptyConfig() {
            return new StaticPastaImpl();
        }

        @Override
        public Food create(List list) {
            return BUILDER.build((Pasta.Config) this.createEmptyConfig(), this, list);
        }

        @Override
        public String getBaseSauce() {
            return null;
        }

        @Override
        public double getBaseThickness() {
            return 2;
        }
    }

    /**
     * Definition of the rigatoni past variant
     */
    static class RigatoniVariant implements Saucable.Variant, Pasta.Variant {
        @Override
        public String getName() {
            return "Rigatoni";
        }

        @Override
        public FoodType getFoodType() {
            return FoodTypes.PASTA;
        }

        @Override
        public BigDecimal getBasePrice() {
            return BigDecimal.valueOf(11.5);
        }

        @Override
        public double getBaseWeight() {
            return 0.2;
        }

        @Override
        public Food.Config createEmptyConfig() {
            return new StaticPastaImpl();
        }

        @Override
        public Food create(List list) {
            return BUILDER.build((Pasta.Config) this.createEmptyConfig(), this, list);
        }

        @Override
        public String getBaseSauce() {
            return null;
        }

        @Override
        public double getBaseThickness() {
            return 10;
        }
    }

    /**
     * Definition of the ravioli pasta variant
     */
    static class RavioliVariant implements Saucable.Variant, Pasta.Variant {
        @Override
        public String getName() {
            return "Ravioli";
        }

        @Override
        public FoodType getFoodType() {
            return FoodTypes.PASTA;
        }

        @Override
        public BigDecimal getBasePrice() {
            return BigDecimal.valueOf(12.5);
        }

        @Override
        public double getBaseWeight() {
            return 0.2;
        }

        @Override
        public Food.Config createEmptyConfig() {
            return new StaticPastaImpl();
        }

        @Override
        public Food create(List list) {
            return BUILDER.build((Pasta.Config) this.createEmptyConfig(), this, list);
        }

        @Override
        public String getBaseSauce() {
            return null;
        }

        @Override
        public double getBaseThickness() {
            return 40;
        }
    }

    /**
     * Definition of the fusilli pasta variant
     */
    static class FusilliVariant implements Saucable.Variant, Pasta.Variant {
        @Override
        public String getName() {
            return "Spaghetti";
        }

        @Override
        public FoodType getFoodType() {
            return FoodTypes.PASTA;
        }

        @Override
        public BigDecimal getBasePrice() {
            return BigDecimal.valueOf(12.5);
        }

        @Override
        public double getBaseWeight() {
            return 0.2;
        }

        @Override
        public Food.Config createEmptyConfig() {
            return new StaticPastaImpl();
        }

        @Override
        public Food create(List list) {
            return BUILDER.build((Pasta.Config) this.createEmptyConfig(), this, list);
        }

        @Override
        public String getBaseSauce() {
            return null;
        }

        @Override
        public double getBaseThickness() {
            return 15;
        }
    }
}
