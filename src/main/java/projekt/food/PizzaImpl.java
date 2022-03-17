package projekt.food;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class PizzaImpl implements Pizza{
    private BigDecimal price;
    private double weight;
    private IceCream.Variant<?,?> foodVariant;
    private  List<? extends Extra<?>> extras;
    private double diameter;
    private String sauce;

    /*
 constructor
 @param price, sets the value of price
 @param weight, sets the value of weight
 @param foodVariant, sets the value of foodVariant
 @param extras, sets the value of extras
 @param diameter, sets the value of diameter
  @param sauce, sets the value of sauce
  */
    public PizzaImpl(BigDecimal price, double weight, IceCream.Variant<?,?> foodVariant, List<? extends Extra<?>> extras, double diameter, String sauce)
    {
        this.price = price;
        this.weight = weight;
        this.foodVariant = foodVariant;
        this.extras = extras;
        this.diameter = diameter;
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
    public List<? extends Extra<?>> getExtras() {
        return extras;
    }

    @Override
    /*
    @return the value of diameter
     */
    public double getDiameter() {
        return diameter;
    }

    @Override
    /*
    @return the value of sauce
     */
    public String getSauce() {
        return sauce;
    }

    private static class StaticPizzaImpl implements  Pizza.Config, Saucable.Config{

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
        public void diameter(DoubleUnaryOperator pobjDoubleUnaryOperator) {

        }

        @Override
        public DoubleUnaryOperator getDiameterMutator() {
            return null;
        }

    }
}
