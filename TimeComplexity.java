class TImeComplexity {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println(findSum(90999898));
        System.out.println("Time Taken : " + (System.currentTimeMillis() - now) + " miliseconds");
    }

    // public static int findSum(int n) {
    //     return n * (n + 1) / 2;
    // }

    public static int findSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}