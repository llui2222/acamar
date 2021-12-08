package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        if(input == null){
            throw new IllegalArgumentException("input is null but shouldn't!");
        }
        int[] res = new int[input.length];
        for (int i = 0,j=input.length-1,k=input.length-1; i<=j;) {
            int left=Math.abs(input[i]);
            int right=Math.abs(input[j]);
            int toRes;
            if (left < right) {
                toRes = right;
                j--;
            }
            else {
                toRes = left;
                i++;
            }
            res[k--]= (int) Math.pow(toRes,2);
        }
        return res;
    }
}
