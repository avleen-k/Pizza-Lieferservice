package projekt.food;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class PastaImpl implements Pasta{
    private BigDecimal price;
    private double weight;
    private Pasta.Variant foodVariant;
    private  List<? extends Extra> extras;
    private double thickness;
    private String sauce;

    /*
   constructor
   @param price, sets the value of price
   @param weight, sets the value of weight
   @param foodVariant, sets the value of foodVariant
   @param extras, sets the value of extras
   @param thickness, sets the value of thickness
    @param sauce, sets the value of sauce
    */
    public PastaImpl(BigDecimal price, double weight, Pasta.Variant foodVariant, List<? extends Extra> extras, double thickness, String sauce)
    {
        this.price = price;
        this.weight = weight;
        this.foodVariant = foodVariant;
        this.extras = extras;
        this.thickness = thickness;
        this.sauce = sauce;
    }
    @Override
     /*
    @return the value of price
     */
    public BigDecimal getPrice() {
        return price;
    }

    @Override
     /*
    @return the value of weight
     */
    public double getWeight() {
        return weight;
    }

    @Override
     /*
    @return the value of foodVariant
     */
    public Food.Variant<?, ?> getFoodVariant() {
        return foodVariant;
    }

    @Override
     /*
    @return the value of extras
     */
    public List<? extends Extra> getExtras() {
        return extras;
    }

    @Override
     /*
    @return the value of thickness
     */
    public double getThickness() {
        return thickness;
    }

    @Override
     /*
    @return the value of sauce
     */
    public String getSauce() {
        return sauce;
    }
    private static class StaticPastaImpl implements Saucable.Config, Pasta.Config
    {

        @Override
        public void price(UnaryOperator<BigDecimal> priceMutator) {
            priceMutator.apply((BigDecimal) priceMutator);
        }

        @Override
        public UnaryOperator<BigDecimal> getPriceMutator() {
            return null;
        }

        @Override
        public void weight(DoubleUnaryOperator weightMutator) {
           // weightMutator.applyAsDouble(weightMutator.);
        }

        @Override
        public DoubleUnaryOperator getWeightMutator() {
            return null;
        }

        @Override
        /*
        the apply method of the UnaryOperator both accepts and returns a string
         */
        public void sauce(UnaryOperator<String> pobjUnaryOperator) {
            pobjUnaryOperator.apply(String.valueOf(pobjUnaryOperator));
        }

        @Override
        public UnaryOperator<String> getSauceMutator() {
            return null;
        }


        @Override
        public void thickness(DoubleUnaryOperator pobjDoubleUnaryOperator) {
           // pobjDoubleUnaryOperator.applyAsDouble(pobjDoubleUnaryOperator);
        }

        @Override
        public DoubleUnaryOperator getThicknessMutator() {
            return null;
        }
    }
}
