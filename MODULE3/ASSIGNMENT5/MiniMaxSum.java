/**
 * Given an array of elements, return the String that has two values separated
 * by commans. The first value is the sum of all the elements except minimum
 * and the second value is the sum of all the elements except the maximum.
 *
 * Input : {1,2,3,4,5};
 * Output : 14,10
 *
 * Input : {1,2}
 * Output : 2,1
 *
 * @author Siva Sankar
 */

final class MiniMaxSum {
    private MiniMaxSum() {
    }
    /**
    * This method returns the minimum element in the array.
    * @param arr , contains the elements in arr.
    * @return the minimum element in the arr. If there are no elements, then
    * it should return -1.
    */
    public static int min(final int[] arr) {
        //  Your code goes here...
        if (arr.length > 0) {
            int a = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < a) {
                    a = arr[i];
}
}
 return a;
 }
return -1;
}

    /**
     * This method returns the maximum element in the array.
     * @param arr , contains the elements in arr.
     * @return the maximum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int max(final int[] arr) {
        //  Your code goes here...
        if (arr.length > 0) {
            int b = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > b) {
                    b = arr[i];
                }
            }
            return b;
        }
        return -1;

    }

    /**
     * This method returns the sum of all the elements in the array.
     * @param arr , contains the elements in arr.
     * @return the sum of all the elements in the arr. returns -1 if there are
     * no elements.
     */
    public static int sum(final int[] arr) {
        //  Your code goes here...
        int s = 0;
        if (arr.length >  0) {
            for (int i = 0; i < arr.length; i++) {
                s += arr[i];
            }
            return s;
        }
        return -1;
    }
    /**
    * Make use of the functions defined for finding the
    * minimum element, maximum element and the sum of all the elements of teh
    * array arr.
    *
    * @param arr , the input array.
    * @return the string version of maxSum and minSum separated by commas.
    */
    public static String miniMaxSum(final int[] arr) {
        //  Your code goes here...
        if (arr.length > 0) {
            int m1 = min(arr);
            int m2 = max(arr);
            int s = sum(arr);
            return ((s - m1) + "," + (s - m2));
        }
        return "";
    }
}
