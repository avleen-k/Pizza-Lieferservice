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

    /*
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
    public Variant<?,?> getFoodVariant() {
        return foodVariant;
    }

    @Override
    /*
    @return the value of extras
     */
    public List<? extends Extra<?>> getExtras() {
        return extras;
    }

    /*
    @return the value of flavor
     */
    public String getFlavor()
    {
        return flavor;
    }

    private static class StaticIceCreamImpl implements Food.Config, IceCream.Config
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

        }

        @Override
        public DoubleUnaryOperator getWeightMutator() {
            return null;
        }


        @Override
        public void flavor(UnaryOperator<String> pobjUnaryOperator) {
            pobjUnaryOperator.apply(String.valueOf(pobjUnaryOperator));
        }

        @Override
        public UnaryOperator<String> getFlavorMutator() {
            return null;
        }
    }
}
