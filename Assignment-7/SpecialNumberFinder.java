// Question-1
class SpecialNumberFinder {
    public static void main(String args[]) {
        for (int n = 1000; n <= 9999; n++) {
            int sum = (n / 100) + (n % 100);
            if (sum * sum == n) System.out.println(n);
        }
    }
}

/*
 * FINAL OUTPUT:
 *
 * 2025
 * 3025
 * 9801
 */



/*
// YOU CAN ALSO USE THIS CODE

class SpecialNumberFinder {
    public static void main(String[] args) {
        System.out.println("4-digit numbers where (firstTwo + lastTwo)^2 = number:");

        for (int number = 1000; number <= 9999; number++) {
            int firstTwo = number / 100;     // Extract first two digits
            int lastTwo = number % 100;      // Extract last two digits

            int sum = firstTwo + lastTwo;
            int square = sum * sum;

            if (square == number) {
                System.out.println(number);
            }
        }
    }
}
*/
