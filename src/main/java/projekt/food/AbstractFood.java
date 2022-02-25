package projekt.food;

import java.math.BigDecimal;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public abstract class AbstractFood {

    private static class StaticFood implements Food.Config{

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
    }
}
