package projekt.food;

import java.math.BigDecimal;
import java.util.List;

public class IceCreamImpl implements IceCream{
    @Override
    public BigDecimal getPrice() {
        return null;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public Variant<?, ?> getFoodVariant() {
        return null;
    }

    @Override
    public List<? extends Extra<?>> getExtras() {
        return null;
    }

    public String getFlavor()
    {
        return null;
    }
}
