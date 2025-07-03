
public class LongestSubstringWithoutRepeatingCharacters{

    public static void main(String[] args){

        String input = "mynamesmanish";
        StringBuilder sb = new StringBuilder();
        String longest = "";
        for(char c : input.toCharArray()){
            int index = sb.toString().indexOf(String.valueOf(c));
            if(index != -1){
                sb.delete(0,index+1);
            }
            sb.append(c);
            if(sb.length()>longest.length()){
                longest = sb.toString();
            }

        }
        System.out.println(longest);

}

}
