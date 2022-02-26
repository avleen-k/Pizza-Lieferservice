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

    public IceCreamImpl(BigDecimal price, double weight, Variant<?,?> foodVariant, List<? extends Extra<?>> extras, String flavor)
    {
        this.price = price;
        this.weight = weight;
        this.foodVariant = foodVariant;
        this.extras = extras;
        this.flavor = flavor;
    }
    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public Variant<?,?> getFoodVariant() {
        return foodVariant;
    }

    @Override
    public List<? extends Extra<?>> getExtras() {
        return extras;
    }

    public String getFlavor()
    {
        return flavor;
    }
    private static class StaticIceCreamImpl implements Food.Config, IceCream.Config
    {

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


        @Override
        public void flavor(UnaryOperator<String> pobjUnaryOperator) {

        }

        @Override
        public UnaryOperator<String> getFlavorMutator() {
            return null;
        }
    }
}
