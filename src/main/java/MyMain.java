import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int num = 0;
        int val = 1;
        int binaryInt = Integer.parseInt(binary);
        for (int i = 1; i <= binaryInt; i *= 10){
            int binaryNum = binaryInt/i%10;
            num += val * binaryNum;
            val *= 2;
        }
        return num;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        String result = "";
        String revResult = "";
        if (decimal==0){
            return "0";
        } else {
            while (decimal != 0) {
                if (decimal % 2 == 0) {
                    result += "0";
                } else {
                    result += "1";
                }
                decimal = decimal / 2;
            }
        }
        for(int i= result.length()-1;i>=0;i--) {
            revResult = revResult + result.charAt(i);
        }
        System.out.println(result);
        System.out.println(revResult);
        return revResult;

    }

    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format: ");
        String binaryNumberInput = scan.nextLine();
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(binaryNumberInput));
        System.out.println();
        System.out.println();
        System.out.println("Type in a number in decimal format: ");
        int decimalNumberInput = scan.nextInt();
        System.out.println("That is equal to the binary value: " + decimalToBinary(decimalNumberInput));
    }
}
