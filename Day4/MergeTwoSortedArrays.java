import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays{
    public static void main(String[] args){
        int[] arr1 = {1,3,5}, arr2={2,4,6,8};
        int i=0, j=0;
        List<Integer> ls = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ls.add(arr1[i++]);
            }else{
                ls.add(arr2[j++]);
            }
       }
       while(i<arr1.length) ls.add(arr1[i++]);
       while(j<arr2.length) ls.add(arr2[j++]);
       System.out.println(ls);
    }
}