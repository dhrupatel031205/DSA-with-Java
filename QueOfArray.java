/*
 * Date : 05/05/2024
 * Name : Dhruv Patel
 * Aim :
 * 1. Remove an even Integer from an array
 *     Input : arr = {2,3,5,4,7,10.6}
 *     Output : arr = {3,7,5}
 * 2. Remove an odd Integer from an array
 *     Input : arr = {2,3,5,4,7,10.6}
 *     Output : arr = {2,4,10,6}
 */

class QueOfArray {
    public static void main(String[] args) {

        // Input array
        int arr[] = { 2, 3, 5, 6, 10, 4, 7 };
        removeEvenElement(arr);
        removeOddElement(arr);
    }

    // It will make resultArray which has not any even element from array arr
    static void removeEvenElement(int[] arr) {
        int evenCount = 0;
        int n = arr.length;
        // for get the count of the even element
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                evenCount++;
            }
        }
        int resultArray[] = new int[evenCount];
        int j = 0;
        // add the final resultant array which has no even element
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                resultArray[j] = arr[i];
                j++;
            }
        }
        // call the method for print an resultant array
        printArray(resultArray);
    }

    // It will make resultArray which has not any odd element from array arr
    static void removeOddElement(int[] arr) {
        int evenCount = 0;
        int n = arr.length;
        // for get the count of the odd element
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }
        int resultArray[] = new int[evenCount];
        int j = 0;
        // add the final resultant array which has no odd element
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                resultArray[j] = arr[i];
                j++;
            }
        }
        printArray(resultArray);
    }

    // Printing an array
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}