package Day3;

// An index i is an equilibrium index if sum of elements at lower indexes = sum of elements at higher indexes.
// Input: [1, 7, 3, 6, 5, 6]
// Output: 3 (Left: 1+7+3 = 11, Right: 5+6 = 11)

public class EquilibriumIndexPivotIndex {
    
    public static void main(String[] args) {
        int arr[] = {1,7,3,2,3,3};
        for(int i =1; i<arr.length-1;i++){
            int sum1 = findSum(arr,0,i), sum2 = findSum(arr,i+1,arr.length);
            if(sum1 == sum2){
                System.out.println(i);
            }
        }
    }
    public static int findSum(int[] a, int left, int right){
        int sum = 0;
        for(int i = left;i<right;i++){
            sum+=a[i];
        }
        return sum;
    }

}
