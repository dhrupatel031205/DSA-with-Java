/*
 * Date : 05/05/2024
 * Name : Dhruv Patel
 * Aim : Array Data Structure
 *       Declaring and Initializing an array
 *       arr.length for get the length of an array
 *       Printing an array
 */

class ArrayDemo {
    // Printing array using for loop
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        arrayDemo();
    }

    static void arrayDemo() {
        // Creating an Array(Declaration and Initialization)
        int myArray[] = new int[5];

        // give the perticular value to the index
        myArray[0] = 10;
        myArray[1] = 17;
        myArray[2] = 12;
        myArray[3] = 30;
        myArray[4] = 20;

        // change the perticular value of the index
        myArray[3] = 25;

        // mostly used trick to implement an array
        int []myArray1 = {10,20,30};
        printArray(myArray1);

        // printing the length of array
        System.out.println(myArray.length);
        System.out.println(myArray1.length);

        // printing array
        printArray(myArray);
    }
}
