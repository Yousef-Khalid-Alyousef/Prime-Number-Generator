public class AlternatingSumFormula extends Prime{

    //done

    // f(n) = 2n + (-1)^n

    public long func(long n){

        return (long) ((2 * n) + Math.pow((-1), n));
    }
}
