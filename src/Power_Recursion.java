//Program to Calculate the power of a number using recursion
public class Power_Recursion { public static void main(String[] args) {
    int base = 2;
    int exponent = 3;
    int result = calculatePower(base, exponent);
    System.out.println(base + " raised to the power of " + exponent + " is: " + result); // Output: 2 raised to the power of 3 is: 8
}

    public static int calculatePower(int base, int exponent) {
        // Base case: If the exponent is 0, the result is 1.
        if (exponent == 0) {
            return 1;
        }
        // Recursive step: Multiply the base by the result of calling the function
        // with the same base and a decremented exponent.
        else {
            return base * calculatePower(base, exponent - 1);
        }

    }
}
