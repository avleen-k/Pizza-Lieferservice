package projekt.food;

import java.util.function.Consumer;

class ExtraImpl<C extends Food.Config> implements Extra<C>{

    private final String name;
    private final int priority;
    private final Consumer<C> configMutator;

    /**
     * This is a constructor which accepts the value for name , priority and configMutator.
     * @param name Name of the Extra
     * @param priority Priority number
     * @param configMutator A consumer which accepts the configurations
     */
    public ExtraImpl(String name, int priority, Consumer<C> configMutator){
        this.name = name;
        this.priority = priority;
        this.configMutator = configMutator;
    }

    /**
     * this method gets the name of the extra object.
     * @return String(Name)
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * this method get the value of priority.
     * @return int
     */
    @Override
    public int getPriority() {
        return priority;
    }

    /**
     * applies the configurations.
     * @param config Configuration
     */
    @Override
    public void apply(C config) {
        if (config != null) {
            this.configMutator.accept(config);
        }
    }
}



