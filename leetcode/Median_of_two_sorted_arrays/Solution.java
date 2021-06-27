import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Queue minHeap = new PriorityQueue();
        Queue maxHeap = new PriorityQueue(Collections.reverseOrder());
        int left=0,right=0;
        int leftSize=nums1.length,rightSize=nums2.length;
        while(left<leftSize && right<rightSize){
            int val = nums1[left]<nums2[right]?nums1[left++]:nums2[right++];
            median(minHeap,maxHeap,val);
        }
        while(left<leftSize){
            int val = nums1[left++];
            median(minHeap,maxHeap,val);
        }
        while(right<rightSize){
            int val = nums2[right++];
            median(minHeap,maxHeap,val);
        }
        if(minHeap.size()==maxHeap.size()){
            int sum = (Integer)minHeap.peek() + (Integer)maxHeap.peek();
            double ret = Double.valueOf(sum);
            return (ret/2.0); 
        }else{
            return Double.valueOf((Integer)minHeap.peek()); 
        }
    }
    public static void median(Queue minHeap,Queue maxHeap, int val){
        if(minHeap.size()==maxHeap.size()){
                maxHeap.offer(val);
                minHeap.offer((Integer) maxHeap.poll());
            }else{
                minHeap.offer(val);
                maxHeap.offer((Integer)minHeap.poll());
            }
    }
}