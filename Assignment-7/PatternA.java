// Question-5_A
class PatternA {
    public static void main(String args[]) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Condition for main and anti-diagonals
                if (i == j || i + j == size - 1) {
                    System.out.print("1  ");
                } else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}

/*
 * FINAL OUTPUT:
 * 
 * 1  0  0  0  1  
 * 0  1  0  1  0  
 * 0  0  1  0  0  
 * 0  1  0  1  0  
 * 1  0  0  0  1  
 */
