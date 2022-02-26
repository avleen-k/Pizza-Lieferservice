package projekt.food;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class PastaImpl implements Pasta{
    private BigDecimal price;
    private double weight;
    private IceCream.Variant<?,?> foodVariant;
    private  List<? extends Extra<?>> extras;
    private double thickness;
    private String sauce;

    public PastaImpl(BigDecimal price, double weight, IceCream.Variant<?,?> foodVariant, List<? extends Extra<?>> extras, double thickness, String sauce)
    {
        this.price = price;
        this.weight = weight;
        this.foodVariant = foodVariant;
        this.extras = extras;
        this.thickness = thickness;
        this.sauce = sauce;
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
    public Food.Variant<?, ?> getFoodVariant() {
        return foodVariant;
    }

    @Override
    public List<? extends Extra<?>> getExtras() {
        return extras;
    }

    @Override
    public double getThickness() {
        return thickness;
    }

    @Override
    public String getSauce() {
        return sauce;
    }
    private static class StaticPastaImpl implements Saucable.Config, Pasta.Config
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
        public void sauce(UnaryOperator<String> pobjUnaryOperator) {

        }

        @Override
        public UnaryOperator<String> getSauceMutator() {
            return null;
        }


        @Override
        public void thickness(DoubleUnaryOperator pobjDoubleUnaryOperator) {

        }

        @Override
        public DoubleUnaryOperator getThicknessMutator() {
            return null;
        }
    }
}
