package Twopointer;

import java.util.Arrays;
import java.util.List;

public class maximumpointsyoucanobtainfromcards {
    public static int maxScore(List<Integer> cardPoints, int k) {
        // Initialize left sum (lsum)
        // and right sum (rsum) to 0.
        int lsum = 0;
        int rsum = 0;
        
        // Initialize the
        // maximum sum (maxSum) to 0.
        int maxSum = 0;
        
        // Set rIndex to the index of
        // the last element in cardPoints.
        int rIndex = cardPoints.size() - 1;
        
        // Calculate the sum of the first k
        // elements from the left side of the array.
        for(int i = 0; i < k; i++) {
            lsum += cardPoints.get(i);
        }
        
        // Initialize maxSum to the sum of
        // the first k elements from the left.
        maxSum = lsum;
        
        // Move one element from the
        // left to the right at a time.
        for(int i = k - 1; i >= 0; i--) {
            // Subtract the current element from
            // lsum as it's moved to the right.
            lsum = lsum - cardPoints.get(i);
            
            // Add the current right
            // element to rsum.
            rsum = rsum + cardPoints.get(rIndex);
            
            // Decrease the right index to point
            // to the next element on the left.
            rIndex = rIndex - 1;
            
            // Update maxSum to the maximum value
            // between the current maxSum and
            // the sum of lsum and rsum.
            maxSum = Math.max(maxSum, lsum + rsum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(6, 2, 3, 4, 7, 2, 1, 7, 1);
        int k = 4;
        
        System.out.println("Given cards: " + arr);
        System.out.println("Number of cards to pick: " + k);
        
        int result = maxScore(arr, k);
        
        System.out.println("Maximum score: " + result);
    }
    
}
