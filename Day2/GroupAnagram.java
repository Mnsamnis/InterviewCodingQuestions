package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        List<String> input = List.of("rac","bat","man","car","arc","tab");
        Map<String,List<String>> output = new LinkedHashMap<>();
        for(String str: input){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            if(!output.containsKey(String.valueOf(ch))){
                output.put(String.valueOf(ch), new ArrayList<>());
            }
                output.get(String.valueOf(ch)).add(str);

            
            
        }
        for(Map.Entry<String, List<String>> mp : output.entrySet()){
            System.out.println(mp.getKey() +" "+mp.getValue());
        }
    }
}
