import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumberinEveryWindowofSizeK {
    public static void main(String[] args) {
        
        int[] input = {-1,4,5,-3,0,-6,7,5};
        int k=3;

        List<Integer> output = new ArrayList<>();

        for(int i=0; i<input.length-k;i++){
            for(int j=i; j<i+k;j++){
                 if(input[j]<0){
                    output.add(input[j]);
                    break;
                 }
            }
        }
        System.out.println(output);

    }
    
}
