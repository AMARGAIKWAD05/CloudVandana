import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
public static void main(String[] args) {
// Create a map to store the values of Roman numerals
Map<Character, Integer> romanToInteger = new HashMap<>();
romanToInteger.put('I', 1);
romanToInteger.put('V', 5);
romanToInteger.put('X', 10);
romanToInteger.put('L', 50);
romanToInteger.put('C', 100);
romanToInteger.put('D', 500);
romanToInteger.put('M', 1000);

// Create a Scanner to read input
Scanner scanner = new Scanner(System.in); System.out.print("Enter a Roman numeral: ");
String romanNumeral = scanner.nextLine().toUpperCase(); scanner.close();

int result = 0;
int prevValue = 0;

// Traverse the Roman numeral from right to left and add values to the result
for(int i = romanNumeral.length() - 1; i >= 0; i--) {
char currentChar = romanNumeral.charAt(i);
int currentValue = romanToInteger.get(currentChar);

if (currentValue < prevValue) { result -= currentValue;
} else {
result += currentValue;
}

prevValue = currentValue;
}

System.out.println("Integer equivalent: " + result);
}
}
