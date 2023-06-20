public class MaxSumSubArray {
    /**
     * Kaden's algorithm
     * take two variables: current_sum and max_sum
     * take current value(b[i]) into consideration=> current_sum= current_sum+b[i]
     * if current_sum > max_sum => max_sum = current-sum
     * when current sum value comes below 0=> if(current_sum < 0) => current_sum = 0
     * */
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("max sum of subarray=>"+maxSum(a));
    }
    static int maxSum(int[] b){
        /**
         * initialise two variables: one will hold sum till current value, other will hold maximum sum we got
         * we update max_sum value only when current_sum > max_sum
         */
        int current_sum=0, max_sum=0;
        for(int i=0; i < b.length; i++){
            current_sum = current_sum + b[i];
            if(current_sum > max_sum){
                max_sum = current_sum;
            }
            /**
             * if any negative value adding makes the result negative,
             * skip those number
             * */
            if(current_sum < 0){
                current_sum = 0;
            }
        }
        return max_sum;
    }
}
