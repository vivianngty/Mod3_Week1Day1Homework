// Write a Java program that reverse a word.
// Write a Java program that prints all prime numbers from 1-20 using a while loop.

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWord("Vivian"));
        primeNumbers();
        getUp(3);
        // String myString = "perscholas";
        // String random = new StringBuilder(myString).reverse().toString();
        // System.out.println(random);
    }
    public static String reverseWord(String word) {
        int i, length = word.length();
        StringBuilder newWord = new StringBuilder(length);
        for (i = (length - 1); i >= 0; i--){
            newWord.append(word.charAt(i));
        }
        return newWord.toString();
    }

    static void primeNumbers() {
        int primeCheckNumber;
        int n = 1;
        int divisibleCount;

        while (n <= 20) {
            divisibleCount = 0;
            primeCheckNumber = 2;
            while (primeCheckNumber <= n / 2) {
                if (n % primeCheckNumber == 0) {
                    divisibleCount++;
                    break;
                }
                primeCheckNumber++;
            }
            if (divisibleCount == 0 && n != 1) {
                System.out.print(n + " ");
            }
            n++;
        }

    }

    static void getUp (int currentHour){
        boolean isSquawking = false;
        if ( currentHour < 6 || currentHour > 22 ){
            isSquawking = true;
            System.out.println(isSquawking);
        } else {
            isSquawking = false;
            System.out.println(isSquawking);
        }
    }

}


