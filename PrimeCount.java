class RangeInPrimeNumbers {
    public static void main(String arg[]) {
        int x = 1;
        int y = 100;
        int primeCount = 0; // Counter for prime numbers

        for (int k = x; k <= y; k++) {
            int count = 0;
            if (k == 1) {
                //System.out.print("1 is not prime\n");
                continue;
            }
            if (k >= 2) {
                for (int i = 1; i <= k; i++) {
                    if (k % i == 0)
                        count = count + 1;
                }
                if (count > 2) {
                    // Not a prime number
                } else {
                    //System.out.println(k);
                    primeCount++; // Increment the counter for prime numbers
                }
            }
        }
        System.out.println(primeCount);
    }
}
