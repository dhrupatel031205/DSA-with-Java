/*
 * Date : 05/05/2024
 * Name : Dhruv Patel
 * Aim : Find the first minimum value of an array
 *        Input : arr = {1,2,0,3,4,2}
 *        Output : 0
 *        Find the first maximum value of an array
 *        Input : arr = {1,2,0,3,4,2}
 *        Output : 4
*/

class QueOfArray2 {
    public static void main(String[] args) {
        // Input array
        int arr[] = { 2, 3, 5, 6, 10, 4, 7 };
        // call method for find the minimum value of an array
        minValueOfArray(arr);
        // call method for find the maximum value of an array
        maxValueOfArray(arr);
    }

    // method for find the minimum value of an array
    public static void minValueOfArray(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        // the for loop for find the min value of an array
        for (int i = 0; i < n; i++) {
            if (min < arr[i]) {
                min = arr[i];
            }
        }
        // printing minimum value
        System.out.println("minimum value = " + min);
    }

    // method for find the maximum value of an array
    public static void maxValueOfArray(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        // the for loop for find the min value of an array
        for (int i = 0; i < n; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
        }
        // printing maximum value
        System.out.println("maximum value = " + max);
    }
}
