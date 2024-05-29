/*
 * Date : 06/05/2024
 * Name : Dhruv Patel
 * Aim : How to resize an Array
 * 
*/

class ResizeArray {
    public static void main(String[] args) {
        // creating an array
        int a[] = { 10, 20, 30, 40 };
        printArray(a);
        System.out.println(a.length);
        a = resizeArray(a, 6);
        printArray(a);
        System.out.println(a.length);
    }

    // method for resize the array and return the array
    public static int[] resizeArray(int[] a, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
        return a;
    }

    // printing an array
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}