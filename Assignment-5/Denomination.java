// Question-1
class Denomination {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Usage: java Denomination <amount>");
            return;
        }

        int amount = Integer.parseInt(args[0]);
        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return;
        }

        System.out.print("Rs." + amount + " = ");

        int count;
        String result = "";
        boolean first = true;

        // 2000 Rs notes
        count = amount / 2000;
        if (count > 0) {
            result += (first ? "" : " + ") + "(2000 * " + count + ")";
            amount %= 2000;
            first = false;
        }

        // 500 Rs notes
        count = amount / 500;
        if (count > 0) {
            result += (first ? "" : " + ") + "(500 * " + count + ")";
            amount %= 500;
            first = false;
        }

        // 200 Rs notes
        count = amount / 200;
        if (count > 0) {
            result += (first ? "" : " + ") + "(200 * " + count + ")";
            amount %= 200;
            first = false;
        }

        // 100 Rs notes
        count = amount / 100;
        if (count > 0) {
            result += (first ? "" : " + ") + "(100 * " + count + ")";
            amount %= 100;
            first = false;
        }

        // 50 Rs notes
        count = amount / 50;
        if (count > 0) {
            result += (first ? "" : " + ") + "(50 * " + count + ")";
            amount %= 50;
            first = false;
        }

        // 20 Rs notes
        count = amount / 20;
        if (count > 0) {
            result += (first ? "" : " + ") + "(20 * " + count + ")";
            amount %= 20;
            first = false;
        }

        // 10 Rs notes
        count = amount / 10;
        if (count > 0) {
            result += (first ? "" : " + ") + "(10 * " + count + ")";
            amount %= 10;
            first = false;
        }

        // 5 Rs notes
        count = amount / 5;
        if (count > 0) {
            result += (first ? "" : " + ") + "(5 * " + count + ")";
            amount %= 5;
            first = false;
        }

        // 2 Rs notes
        count = amount / 2;
        if (count > 0) {
            result += (first ? "" : " + ") + "(2 * " + count + ")";
            amount %= 2;
            first = false;
        }

        // 1 Rs coins
        count = amount;
        if (count > 0) {
            result += (first ? "" : " + ") + "(1 * " + count + ")";
        }

        System.out.println(result);
    }
}

/*
 * FINAL OUTPUT:
 * 
 * java Denomination 3868
 * Rs.3868 = (2000 * 1) + (500 * 3) + (200 * 1) + (100 * 1) + (50 * 1) + (10 * 1) + (5 * 1) + (2 * 1) + (1 * 1)
 */





/*
// ANOTHER WAY TO GET THE RESULT (Using Array)

import java.util.*;
class Denomination {

    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("Usage: java Denomination <amount>");
            return;
        }

        int amount = Integer.parseInt(args[0]);
        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return;
        }
		System.out.print("Rs."+amount+" = ");

        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		List<String> resultParts = new ArrayList<>();

        for (int note : notes) {
            int count = amount / note;
            if (count > 0) {
                resultParts.add("(" + note + " * " + count + ")");
                amount %= note;
            }
        }
		System.out.println(String.join(" + ", resultParts));
    }
}
*/
