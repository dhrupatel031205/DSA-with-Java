/*
 * Date : 07/05/2024
 * Name : Dhruv Patel
 * Aim : Find the missing number of an Array
 * 
*/

class MissingNumber {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5, 6, 7 };
        findMissingNumber(a);
        int b[] = { 1, 2, 4, 5, 3, 7 };
        findMissingNumber(b);
        int c[] = { 1, 2, 4, 3, 6, 7 };
        findMissingNumber(c);
    }

    // logic for find the missing number from 1 to n
    public static void findMissingNumber(int a[]) {
        // n is the length of array + 1
        int n = a.length + 1;
        // sum of n numbers
        int sum = n * (n + 1) / 2;
        for (int i : a) {
            sum = sum - i;
        }
        System.out.println("missing number is : " + sum);
    }
}
