//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JavaNumerics {
    public static void main(String[] args) {

        // Step 6: int variables
        int intOperandA = 1;
        int intOperandB = 5;
        int intSum = 13;
        int intProduct = 14;
        int intDifference = 15;
        int intQuotient = 16;
        int intModulo = 17;

        // Step 7: double variables
        double doubleOperandA = 3.5;
        double doubleOperandB = 5.5;
        double doubleSum = 6.5;
        double doubleProduct = 7.5;
        double doubleDifference = 8.5;
        double doubleQuotient = 9.5;

        // Step 8: do math with int variables
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);

        intDifference = intOperandA - intOperandB;
        System.out.println("the difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of  " + intOperandA + " * " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);

        // Step 10: do math with double variables
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The differrence using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);

    // Number of kids
        int numberKids = 3;
        System.out.println("The number of Kids using int is " + numberKids);

    // Is it raining? (boolean)
    boolean isRaining = true;
    System.out.println("Is Raining? " + isRaining);

    //Price of gas (double)
        double gasPrice = 5.40;
        System.out.println("The gas price is " + gasPrice);

    // Favorite number (int)
    int favoriteNumber = 23;
    System.out.println("The favorite number is " + favoriteNumber);

    // Shoe size (double if half sizes exist)
        double shoeSize = 10.5;
        System.out.println("The shoe size is " + shoeSize);

    // Birth month (String)
    String birthMonth = "September";
    System.out.println("The birth month is " + birthMonth);

    // Full name
        String fullName = "Ryan Miller";
        System.out.println("My full name is: " + fullName);
    }
}

