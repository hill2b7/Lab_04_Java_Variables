import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        //sets intOperandA to value 1
        int intOperandA = 4; //Variable Declaration
        int intOperandB = 2; //Variable Declaration
        int intSum = 0; //Variable Declaration
        int intProduct = 0; //Variable Declaration
        int intDifference = 0; //Variable Declaration
        int intQuotient = 0; //Variable Declaration
        int intModulo = 0; //Variable Declaration
        double doubleOperandA = 3.50; //Variable Declaration
        double doubleOperandB = 7.50; //Variable Declaration
        double doubleSum = 0.00; //Variable Declaration
        double doubleProduct = 0.00; //Variable Declaration
        double doubleDifference = 0.00; //Variable Declaration
        double doubleQuotient = 0.00; //Variable Declaration
        double doubleModulo = 0.00; //Variable Declaration
        intSum = intOperandA + intOperandB; //Assignment that uses +
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum); //Output Statement
        intProduct = intOperandA * intOperandB; //Assignment that uses *
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct); //Output Statement
        intDifference = intOperandA - intOperandB; // Assignment that uses -
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference); //Output Statement
        intQuotient = intOperandA / intOperandB; //Assignment using /
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient); //Output statement
        intModulo = intOperandA % intOperandB; //Assignment using %
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo); //Output Statement
        doubleSum = doubleOperandA + doubleOperandB; //Assignment that uses +
        System.out.println("The sum using ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum); //Output Statement
        doubleProduct = doubleOperandA * doubleOperandB; // Assignment that uses *
        System.out.println("The product using ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct); //Output Statement
        doubleDifference = doubleOperandA - doubleOperandB; //Assignment that uses -
        System.out.println("The difference using ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference); //Output Statement
        doubleQuotient = doubleOperandA / doubleOperandB; //Assignment that uses /
        System.out.println("The quotient using ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient); //Output Statement
        doubleModulo = doubleOperandA % doubleOperandB; //Assignment that uses %
        System.out.println("The Modulo using ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo); //Output Statement
        int numOfKids = 8;
        String isRaining = "true";
        double priceOfGas = 3.09;
        int favNum = 35;
        double shoeSize = 12.5;
        int birthMonth = 8;
        String firstName = "Blake";
        String lastName = "Hill";


        System.out.println("There are " + numOfKids + " kids in my family.");
        System.out.println("Is it raining? " + isRaining);
        System.out.println("The price of gas is " + priceOfGas + " per gallon.");
        System.out.println("My favorite number is " + favNum + ".");
        System.out.println("My shoe size is " + shoeSize + ".");
        System.out.println("My birth month is the " + birthMonth + " month of the year.");
        System.out.println("Is it raining? " + isRaining);
        System.out.println("My full name is " + firstName + " " + lastName );
    }
}