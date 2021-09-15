import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testBinaryToDecimal() {
        assertEquals(1, MyMain.binaryToDecimal("1"), "The decimal value of \"1\" should be: " + 1);
        assertEquals(2, MyMain.binaryToDecimal("10"), "The decimal value of \"10\" should be: " + 2);
        assertEquals(3, MyMain.binaryToDecimal("11"), "The decimal value of \"11\" should be: " + 3);
        assertEquals(4, MyMain.binaryToDecimal("100"), "The decimal value of \"100\" should be: " + 4);
        assertEquals(5, MyMain.binaryToDecimal("101"), "The decimal value of \"101\" should be: " + 5);
        assertEquals(6, MyMain.binaryToDecimal("110"), "The decimal value of \"110\" should be: " + 6);
        assertEquals(7, MyMain.binaryToDecimal("111"), "The decimal value of \"111\" should be: " + 7);
        assertEquals(8, MyMain.binaryToDecimal("1000"), "The decimal value of \"1000\" should be: " + 8);
        assertEquals(0, MyMain.binaryToDecimal("0"), "The decimal value of \"0\" should be: " + 0);
        assertEquals(170, MyMain.binaryToDecimal("10101010"), "The decimal value of \"10101010\" should be: " + 170);
        assertEquals(1023, MyMain.binaryToDecimal("1111111111"), "The decimal value of \"1111111111\" should be: " + 1023);
        assertEquals(65, MyMain.binaryToDecimal("1000001"), "The decimal value of \"1000001\" should be: " + 65);

    }

    @Test
    public void testDecimalToBinary() {
        assertEquals("1", MyMain.decimalToBinary(1), "The binary representation of 1 should be: \"1\"");
        assertEquals("10", MyMain.decimalToBinary(2), "The binary representation of 2 should be: \"10\"");
        assertEquals("11", MyMain.decimalToBinary(3), "The binary representation of 3 should be: \"11\"" + 3);
        assertEquals("100", MyMain.decimalToBinary(4), "The binary representation of 4 should be: \"100\"");
        assertEquals("101", MyMain.decimalToBinary(5), "The binary representation of 5 should be: \"101\"");
        assertEquals("110", MyMain.decimalToBinary(6), "The binary representation of 6 should be: \"110\"");
        assertEquals("111", MyMain.decimalToBinary(7), "The binary representation of 7 should be: \"111\"");
        assertEquals("1000", MyMain.decimalToBinary(8), "The binary representation of 8 should be: \"1000\"");
        assertEquals("0", MyMain.decimalToBinary(0), "The binary representation of 0 should be: \"0\"");
        assertEquals("10101010", MyMain.decimalToBinary(170), "The binary representation of 170 should be: \"10101010\"");
        assertEquals("1111111111", MyMain.decimalToBinary(1023), "The binary representation of 1023 should be: \"1111111111\"");
        assertEquals("1000001", MyMain.decimalToBinary(65), "The binary representation of 65 should be: \"1000001\"");
    }
}
