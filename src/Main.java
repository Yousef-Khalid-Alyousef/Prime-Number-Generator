import java.util.ArrayList;
import java.util.Scanner;

/*

o	Which formulas generate most of prime numbers
o	Which formulas provide the first non-prime number
o	Time to compute all prime numbers (up to 10 000 first numbers)

 */

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);



        System.out.println("Choose formula to generate: \n" +
                "1- f(n) = 2n^2 + 29 \n" +
                "2- f(n) = 6n - 1 \n" +
                "3- f(n) = n^2 + 15 \n" +
                "4- f(n) = n^2 + n + 17 \n" +
                "5- f(n) = n^2 + 79n + 1601 \n" +
                "6- f(n) = 2n^2 + 1 \n" +
                "7- f(n) = n^2 + (n+1)^2 \n" +
                "8- f(n) = n^2 + 1 \n" +
                "9- f(n) = 2n + (-1)^n \n" +
                "10 - f(n) = n^2 - 1 \n");
        System.out.print("Choose formula: ");
        int choice = s.nextInt();
        switch (choice){
            case 1:

                // f(n) = 2n^2 + 29

                SumofSquaresFormula sumofSquaresFormula = new SumofSquaresFormula();
                long startTime = System.nanoTime();
                for (int i = 1; i <= 10000; i++){
                    sumofSquaresFormula.isPrime(sumofSquaresFormula.func(i));
                }
                long endTime = System.nanoTime();
                System.out.println("The number of primes: "+sumofSquaresFormula.getCounterPrimeNumbers());

                System.out.println("Time taken: " + (endTime - startTime)/1000000 + " ms");

                break;

                case 2:

                   // f(n) = 6n - 1

                    TwinPrimeFormula twinPrimeFormula = new TwinPrimeFormula();
                    long startTimeTwin = System.nanoTime();
                    for (int i = 1; i <= 10000; i++){
                        twinPrimeFormula.isPrime(twinPrimeFormula.func(i));
                    }
                    long endTimeTwin = System.nanoTime();
                    System.out.println("The number of primes: "+twinPrimeFormula.getCounterPrimeNumbers());


                    System.out.println("Time taken: " + (endTimeTwin - startTimeTwin)/1000000 + " ms");

                    break;


                    case 3:

                        //f(n) = n^2 + 15

                        PrimeShiftedSquares primeShiftedSquares = new PrimeShiftedSquares();
                        long startTimePrimeShifted = System.nanoTime();
                        for (int i = 1; i <= 10000; i++){
                            primeShiftedSquares.isPrime(primeShiftedSquares.func(i));
                        }
                        long endTimePrimeShifted = System.nanoTime();
                        System.out.println("The number of primes: "+primeShiftedSquares.getCounterPrimeNumbers());


                        System.out.println("Time taken: " + (endTimePrimeShifted - startTimePrimeShifted)/1000000 + " ms");

                        break;

                        case 4:

                            //f(n) = n^2 + n + 17

                            PrimeGeneratingPolynomial primeGeneratingPolynomial = new PrimeGeneratingPolynomial();
                            long startPrimeGen = System.nanoTime();
                            for (int i = 1; i <= 10000; i++){
                                primeGeneratingPolynomial.isPrime(primeGeneratingPolynomial.func(i));
                            }
                            long endPrimeGen = System.nanoTime();
                            System.out.println("The number of primes: "+ primeGeneratingPolynomial.getCounterPrimeNumbers());


                            System.out.println("Time taken: " + (endPrimeGen - startPrimeGen)/1000000 + " ms");

                            break;

                            case 5:

                                //f(n) = n^2 + 79n + 1601

                                QuadraticPlusConstant quadraticPlusConstant = new QuadraticPlusConstant();
                                long startTimequadraticPlusConstant = System.nanoTime();
                                for (int i = 1; i <= 10000; i++){
                                    quadraticPlusConstant.isPrime(quadraticPlusConstant.func(i));
                                }
                                long endTimeQuad = System.nanoTime();
                                System.out.println("The number of primes: "+ quadraticPlusConstant.getCounterPrimeNumbers());


                                System.out.println("Time taken: " + (endTimeQuad - startTimequadraticPlusConstant)/1000000 + " ms");

                                break;

                                case 6:

                                    //f(n) = 2n^2 + 1

                                    PrimeSumsofOddSquares primeSumsofOddSquares = new PrimeSumsofOddSquares();
                                    long startTimePrimeSumsofOddSquares = System.nanoTime();
                                    for (int i = 1; i <= 10000; i++){
                                        primeSumsofOddSquares.isPrime(primeSumsofOddSquares.func(i));
                                    }
                                    long endTimePrimeSumsofOddSquares = System.nanoTime();
                                    System.out.println("The number of primes: "+primeSumsofOddSquares.getCounterPrimeNumbers());


                                    System.out.println("Time taken: " + (endTimePrimeSumsofOddSquares - startTimePrimeSumsofOddSquares)/1000000 + " ms");
                                    break;

                                    case 7:

                                        //f(n) = n^2 + (n+1)^2

                                        SumofTwoSquares sumofTwoSquares = new SumofTwoSquares();
                                        long startTimeSumofTwo = System.nanoTime();
                                        for (int i = 1; i <= 10000; i++){
                                            sumofTwoSquares.isPrime(sumofTwoSquares.func(i));
                                        }
                                        long endTimeSumofTwo = System.nanoTime();
                                        System.out.println("The number of primes: "+ sumofTwoSquares.getCounterPrimeNumbers());


                                        System.out.println("Time taken: " + (endTimeSumofTwo - startTimeSumofTwo)/1000000 + " ms");

                                        break;

                                        case 8:

                                            // f(n) = n^2 + 1

                                            PrimeGapsFormula primeGapsFormula = new PrimeGapsFormula();
                                            long startTimePrimeGaps = System.nanoTime();
                                            for (int i = 1; i <= 10000; i++){
                                                primeGapsFormula.isPrime(primeGapsFormula.func(i));
                                            }
                                            long endTimePrimeGaps = System.nanoTime();
                                            System.out.println("The number of primes: "+primeGapsFormula.getCounterPrimeNumbers());


                                            System.out.println("Time taken: " + (endTimePrimeGaps-startTimePrimeGaps)/1000000 + " ms");

                                            break;

                                            case 9:

                                                //f(n) = 2n + (-1)^n

                                                AlternatingSumFormula alternatingSumFormula = new AlternatingSumFormula();
                                                long startTimeAlternatingSum = System.nanoTime();
                                                for (int i = 1; i <= 10000; i++){
                                                    alternatingSumFormula.isPrime(alternatingSumFormula.func(i));
                                                }
                                                long endTimeAlternatingSum = System.nanoTime();
                                                System.out.println("The number of primes: "+alternatingSumFormula.getCounterPrimeNumbers());


                                                System.out.println("Time taken: " + (endTimeAlternatingSum-startTimeAlternatingSum)/1000000 + " ms");

                                                break;

                                                case 10:

                                                    //f(n) = n^2 - 1

                                                    CoprimeFunction coprimeFunction = new CoprimeFunction();
                                                    long startTimeCoprime = System.nanoTime();
                                                    for (int i = 1; i <= 10000; i++){
                                                        coprimeFunction.isPrime(coprimeFunction.func(i));
                                                    }
                                                    long endTimeCoprime = System.nanoTime();
                                                    System.out.println("The number of primes: "+coprimeFunction.getCounterPrimeNumbers());


                                                    System.out.println("Time taken: " + (endTimeCoprime-startTimeCoprime)/1000000 + " ms");
                                                    break;

                                                    default:
                                                        break;

        }



        ArrayList<Prime> formulas = new ArrayList<>();
        formulas.add(new SumofSquaresFormula());
        formulas.add(new TwinPrimeFormula());
        formulas.add(new PrimeShiftedSquares());
        formulas.add(new PrimeGeneratingPolynomial());
        formulas.add(new QuadraticPlusConstant());
        formulas.add(new PrimeSumsofOddSquares());
        formulas.add(new SumofTwoSquares());
        formulas.add(new PrimeGapsFormula());
        formulas.add(new AlternatingSumFormula());
        formulas.add(new CoprimeFunction());


        String firstNonPrimeFormula = null;
        int firstNonPrimeIndex = Integer.MAX_VALUE;


        for (int i = 1; i <= 10000; i++) {
            for (Prime formula : formulas) {
                formula.isPrime(formula.func(i));

                if (formula.getFirstNonPrimeIndex() != -1 && formula.getFirstNonPrimeIndex() < firstNonPrimeIndex) {
                    firstNonPrimeIndex = formula.getFirstNonPrimeIndex();
                    firstNonPrimeFormula = formula.getClass().getSimpleName();
                }
            }
        }


        if (firstNonPrimeFormula != null) {
            System.out.println("The formula that encountered the first non-prime is: " + firstNonPrimeFormula);
            System.out.println("It encountered the first non-prime at index: " + firstNonPrimeIndex);
        } else {
            System.out.println("All formulas generated only prime numbers up to n = 10,000.");
        }



    }
}