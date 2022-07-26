package cd.get.ready.algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        return getNumberOfDuplicates(input);
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        return getNumberOfDuplicates(input);
    }

    private Integer getNumberOfDuplicates(Object[] input){
        return Arrays.stream(input)
                .filter(s -> Collections.frequency(List.of(input), s) > 1)
                .collect(Collectors.toSet()).size();
    }
}
