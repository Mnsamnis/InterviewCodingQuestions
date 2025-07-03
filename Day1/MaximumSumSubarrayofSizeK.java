public class MaximumSumSubarrayofSizeK {

    public static void main(String[] args){

        int[] input = {3,7,5,1,17,2,9,12};
        int k = 3;
        int maxSum = 0;
        for(int j = 0; j<k;j++){
            maxSum += input[j];
        }
        int sum =maxSum;
        for(int i = k; i<input.length; i++){
            sum = sum + input[i] - input[i-k];
            if(sum>maxSum) maxSum = sum;
        }
        System.out.println(maxSum);

    }
    
}
