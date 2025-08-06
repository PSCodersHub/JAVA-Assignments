// Question-5_B
class PatternB {
    public static void main(String args[]) {
        // The outer loop controls the number of rows
        for (int i = 1; i <= 5; i++) {
            // The inner loop prints the numbers in each row
            for (int j = 5; j >= i; j--) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}

/*
 * FINAL OUTPUT:
 * 
 * 5  4  3  2  1  
 * 5  4  3  2  
 * 5  4  3  
 * 5  4  
 * 5  
 */
