/**
 * Given an array of integers Find the mean, median, mode, standard deviation
 * and variance.
 * 
 * Mean
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Median
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Mode
 * Input : [1,1,2,2,3]
 * Output : [1,2]
 * 
 * Variance
 * Input : [1,2,3,4,5]
 * Output : 2.0
 * 
 * Standard Deviation
 * Input : [1,2,3,4,5]
 * Output : 1.41421356
 * 
 * @author Siva Sankar
 */

import java.util.*;
import java.lang.Math;
public class Stats {

    /**
     * This method should return the mean of the elements of the array.
     * If the arr is empty (length is 0), return the mean as 0.
     * @param arr, the input array contians elements.
     * @return the mean of the array.
     */
    public static double mean(int[] arr) {
        //  Your code goes here....
        double sum = 0;
        if(arr.length==0){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];      
          }
        return sum / arr.length;
    }

    /**
     * This method returns the median of the elements of the array.
     * Prerequisite : The array should be sorted to find the median.
     * 
     * Hint : Arrays.sort(arr) sorts the elements of the array.
     * 
     * @param arr, the input array contains random elements (not in sorted order)
     * @return the median of the elements of the array.
     */
    public static double median(int[] arr) {
        //  Your code goes here...
        Arrays.sort(arr);
        double median;
        if(arr.length%2==0){
            median=(arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;
            return median;   
        }
        else{
            median=arr[arr.length/2];
            return (double)median;
        }
    }

    /**
     * This method returns the mode of the array. If there is no mode, then it returns
     * 0 as the mode.
     * 
     * @param arr, the input array.
     * @return the mode of the array, 0 otherwise if there is no mode.
     */
    public static int mode(int[] arr) {
        //  Your code goes here....
        int max=1;
        int mode=0;       
        for(int i=0;i<arr.length;i++){
            int count=0;
           for(int j=0;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   count=count+1;

               }
           }
           if(count>max){
               max=count;
               mode=arr[i];
           }
       }
       if(max==1){
        return 0;
    }
    return mode;
}

    /**
     * This method returns the variance of the input array.
     * Make use of the mean functon which has already written.
     * 
     * @param arr, the input array
     * @return the variance of the array.
     */
    public static double variance(int[] arr) {
        //  Your code goes here....
        double m=mean(arr);
        double var=0;
        for(int i=0;i<arr.length;i++){
            var=var+(m-arr[i])*(m-arr[i]);

        }


        return var/arr.length;
    }

    /**
     * This method returns the standard deviation of the array.
     * Hint : You can find the square root using Math.sqrt() method.
     * @param arr, the input array
     * @return the standard deviation of the input array.
     */
    public static double standardDeviation(int[] arr) {
        //  Your code goes here....
          double v=variance(arr);
          double b=Math.sqrt(v);


        return b;
    }
}