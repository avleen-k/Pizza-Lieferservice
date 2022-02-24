package projekt.food;


import java.util.ArrayList;
import java.util.List;

/**
 * A modification that targets configurable values in a {@link Food.Config}.
 *
 * @param <C> The target {@link Food.Config} type
 */
public interface Extra<C extends Food.Config> {

    /**
     * The name of this extra.
     *
     * @return The name of this extra
     */
    String getName();

    /**
     * The priority of the extra, lower is calculated first.
     */
    int getPriority();

    /**
     * Applies the modifications of this extra to the provided {@link C config}.
     */
    void apply(C config);

    /**
     * The method writeToConfig creates a sorted list based on the provided list,
     * then implements the method apply from this Inteface Extra to every element of the sorted list.
     * @param config type C, is the configuration to be applied
     * @param extras type List<? extends Extra<? super C>> is the provied listed to be sorted
     * @param <C> the generic type of the method.
     */
    static <C extends Food.Config> void writeToConfig(C config, List<? extends Extra<? super C>> extras){
        //creating a new ArrayList, this will be our new the sorted list
        ArrayList<Extra> sortedExtras = new ArrayList<>();

        //sorting the list and filling the ArrayList
        for(int i = 0; i < extras.size(); i++){
            if(extras.get(i).getPriority() < extras.get(i + 1).getPriority()){
                sortedExtras.set(i, extras.get(i));
            }
            if(extras.get(i).getPriority() > extras.get(i + 1).getPriority()){
                sortedExtras.set(i, extras.get(i + 1));
            }
            if(extras.get(i).getPriority() == extras.get(i + 1).getPriority()){
                int compare = extras.get(i).getName().compareTo(extras.get(i + 1).getName());
                if(compare < 0){ // means that string i < string i + 1
                    sortedExtras.set(i, extras.get(i));
                }
                else{
                    sortedExtras.set(i, extras.get(i + 1));
                }
            }
        }

        //using the method apply with every element of the new sorted Arraylist
        for(Extra o : sortedExtras){
            o.apply(config);
        }
    }
}
