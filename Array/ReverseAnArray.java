/*
 * Date : 05/05/2024
 * Name : Dhruv Patel
 * Aim : Reverse an Array from perticular starting index to last index
 *      0 to length-1
 *      Input : arr = {1,2,3,4}
 *      Output : arr = {4,3,2,1}
 *      2 to 3
 *      Input : arr = {1,2,3,4}
 *      Output : arr = {1,3,2,4}
*/

class ReverseAnArray {
    public static void main(String[] args) {
        // Input array
        int arr[] = { 2, 3, 5, 6, 10, 4, 7 };
        // call method for reverse array
        reverseArray(arr, 0, 6);
    }

    // method for reverse an array
    public static void reverseArray(int[] arr, int start, int end) {
        // this while loop will work until start to end index
        while (start < end) {
            // swapping logic
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // printing resultant array
        printArray(arr);
    }

    // Printing an array
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
