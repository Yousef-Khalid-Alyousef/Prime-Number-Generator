

public abstract class Prime {

    public int counterPrimeNumbers = 0;
    public int firstNonPrimeIndex = Integer.MAX_VALUE;


    public abstract long func(long n);


    public boolean isPrime(long n) {


        if (n == 2 ) {
            counterPrimeNumbers++;
            return true;
        }

        //checks if its not prime
        if (n % 2 == 0) {
            if (firstNonPrimeIndex == Integer.MAX_VALUE) {
                firstNonPrimeIndex = counterPrimeNumbers + 1;
            }
            return false;
        }


        long sqrt = (long) Math.sqrt(n);
        for (long i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                if (firstNonPrimeIndex == Integer.MAX_VALUE) {
                    firstNonPrimeIndex = counterPrimeNumbers + 1;
                }
                return false;
            }
        }


        counterPrimeNumbers++;
        return true;
    }


    public int getFirstNonPrimeIndex() {
        if (firstNonPrimeIndex == Integer.MAX_VALUE) {
            return -1;
        }
        else {
            return firstNonPrimeIndex;
        }
    }


    public int getCounterPrimeNumbers() {
        return counterPrimeNumbers;
    }
}