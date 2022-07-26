package cd.get.ready.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        Map<String, Integer> count = new HashMap<String, Integer>();
        for(String s : input){
            if(count.containsKey(s))
                count.put(s, count.get(s) + 1);
            else
                count.put(s, 1);
        }
        return countRepeated(count);
    }

    private Integer countRepeated(Map<String, Integer> map){
        int result = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1)
                result++;
        }
        return result;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(Integer s : input){
            if(count.containsKey(s))
                count.put(s, count.get(s) + 1);
            else
                count.put(s, 1);
        }
        return countRepeatedIntegers(count);
    }

    private Integer countRepeatedIntegers(Map<Integer, Integer> map){
        int result = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1)
                result++;
        }
        return result;
    }
}
