/*
 * Date : 05/05/2024
 * Name : Dhruv Patel
 * Aim : Find the second maximum value of an array
 *       Innput : arr = {1,2,3,4,5,6,7}
 *       Output : 6
*/

class QueOfArray3 {
    public static void main(String[] args) {
        // Input array
        int arr[] = { 2, 3, 5, 6, 10, 8, 7 };
        secondMaxValueOfArray(arr);
    }

    // method for find the second maximum value of an array
    public static void secondMaxValueOfArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // logic for swap the array and get the second maximum value 
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second maximum value = " + secondMax);
    }
}
