package driver;

public class Main {

    /**
     * Takes two integers and returns their sum.
     * @param firstInt an integer
     * @param secondInt an integer
     * @return the sum of the integers provided
     */
    private static int addInts(int firstInt, int secondInt) {
        return firstInt + secondInt;
    }

    public static void main(String[] args) {
        try {
            int firstInt = Integer.parseInt(args[0]);
            int secondInt = Integer.parseInt(args[1]);
            int sum = addInts(firstInt, secondInt);

            // print negatives as (negativeInt) instead of with a dash
            if (sum < 0) {
                System.out.println(String.format("(%d)", Math.abs(sum)));
            } else {
                System.out.println(sum);
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
            // user either didn't provide values or provided non-integers.
            System.err.println("Please provide two integers as input.");
        }
    }
}
