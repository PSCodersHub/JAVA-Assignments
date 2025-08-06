// Question-4
import java.util.Scanner;

class PrimeWithPrimeDigitSum {
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) 
            if (num % i == 0) return false;
        return true;
    }
    
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter range (m n): ");
        int m = s.nextInt(), n = s.nextInt();
        s.close();
        
        System.out.println("Prime numbers with prime digit sum:");
        for (int i = m; i <= n; i++) {
            if (isPrime(i) && isPrime(sumOfDigits(i))) {
                System.out.println(i);
            }
        }
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter range (m n): 10 50
 * Prime numbers with prime digit sum:
 * 11
 * 23
 * 29
 * 41
 * 43
 * 47
 */



/*
 * DETAILED EXPLANATION FOR RANGE 10 TO 50:
 * 
 * Numbers that qualify (Prime AND Prime Digit Sum):
 * 
 * 11: Prime? YES | Digit Sum: 1+1=2 | Is 2 Prime? YES ✓
 * 23: Prime? YES | Digit Sum: 2+3=5 | Is 5 Prime? YES ✓  
 * 29: Prime? YES | Digit Sum: 2+9=11 | Is 11 Prime? YES ✓
 * 41: Prime? YES | Digit Sum: 4+1=5 | Is 5 Prime? YES ✓
 * 43: Prime? YES | Digit Sum: 4+3=7 | Is 7 Prime? YES ✓
 * 47: Prime? YES | Digit Sum: 4+7=11 | Is 11 Prime? YES ✓
 * 
 * Numbers that DON'T qualify (Prime but NOT Prime Digit Sum):
 * 
 * 13: Prime? YES | Digit Sum: 1+3=4 | Is 4 Prime? NO ✗
 * 17: Prime? YES | Digit Sum: 1+7=8 | Is 8 Prime? NO ✗
 * 19: Prime? YES | Digit Sum: 1+9=10 | Is 10 Prime? NO ✗
 * 31: Prime? YES | Digit Sum: 3+1=4 | Is 4 Prime? NO ✗
 * 37: Prime? YES | Digit Sum: 3+7=10 | Is 10 Prime? NO ✗
 * 
 * FINAL OUTPUT:
 * Enter range (m n): 10 50
 * Prime numbers with prime digit sum:
 * 11
 * 23  
 * 29
 * 41
 * 43
 * 47
 */
