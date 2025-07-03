package Day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String input = "codeanddecode";

        LinkedHashMap<Character, Long> occurance = input.chars().mapToObj(c->(char) c)
        .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()));

        for(Map.Entry<Character, Long> mp : occurance.entrySet()){
            if(mp.getValue() == 1){
                System.out.println(mp.getKey());
                break;
            }
        }

    }
    
}
