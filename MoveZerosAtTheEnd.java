/*
 * Date : 06/05/2024
 * Name : Dhruv Patel
 * Aim : move all the 0's at the end of the array but maintain the order of the other elements
 *       Innput : arr = {0,1,0,2,3,0,4}
 *       Output : arr = {1,2,3,4,0,0,0}
*/

class QueOfArray4 {
    public static void main(String[] args) {
        // Input array
        int arr[] = { 2, 0, 0, 6, 0, 8, 7 };
        moveZeros(arr,arr.length);
    }

    // moveZeros() for move the 0s at the end of the array
    static void moveZeros(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
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
