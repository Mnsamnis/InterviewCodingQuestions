import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int arr[] = {4,7,2,9,3}, nums[] = {25,14,67,3,8}, k=2;
        int len =arr.length;       
        Arrays.sort(arr);
        System.out.println(arr[len-k]);   
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int a:nums){
            pq.offer(a);
            if(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
}
