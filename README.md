# Decimal and Binary Assignment

In this assignment, you will be writing two methods to convert between decimal and binary numbers. 

The first method is binaryToDecimal(). This method takes a String representing a binary number (e.g. "1010") as input, and returns the decimal value of that number. Remember that you can use Integer.parseInt() to convert a String into an integer. Your code should have the following signature: public static int binaryToDecimal(String binary) {}

The second method is decimalToBinary(). This method takes an int representing a decimal number (e.g. 152) as input, and returns a String representing the binary representation of that number. Your code should have the following signature: public static String decimalToBinary(int decimal) {}


After writing the methods and testing that it works, add some code to your main method to test the methods. You should use Scanner in your main code to ask the user to type in a String representing the binary number, and then convert the number to a decimal number using your method. You should then do the same with a decimal number.

Example of what your program may look like when it is being run:
```shell script
Type in a number in binary format: 
1111111111
That is equal to the decimal value: 1023
Type in a number in decimal format: 
13
That is equal to the binary value: 1101
```

<br />
<br />

Add code to [MyMain.java](src/main/java/MyMain.java) to do the desired thing.

## Run your code with:
The easiest way to run your code is to press the play button in [MyMain.java](src/main/java/MyMain.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make run
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew run
```

## Run your tests with:
The easiest way to run your code is to press the play button in [MyTests.java](src/test/java/MyTests.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make test
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew test
```
