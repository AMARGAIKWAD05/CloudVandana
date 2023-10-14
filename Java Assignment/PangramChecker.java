package arrayshuffle;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    
    public static void main(String[] args)
    { Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
String input = scanner.nextLine().toLowerCase(); scanner.close();

if (isPangram(input)) {
System.out.println("The input is a pangram.");
} else {
System.out.println("The input is not a pangram.");
}
}

public static boolean isPangram(String sentence) {
// Create a set to store unique lowercase alphabet characters
Set<Character> alphabetSet = new HashSet<>();

// Iterate through the sentence
for (char c : sentence.toCharArray()) {
    if (Character.isLetter(c)) {
alphabetSet.add(c);
}
}

// Check if the set contains all 26 lowercase alphabet characters 
return alphabetSet.size() == 26;
}

}
