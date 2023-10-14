package arrayshuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayShuffle {
    public static void main(String[] args) {
// Create an ArrayList with the values (1, 2, 3, 4, 5, 6, 7) 
List<Integer> arrayList = new ArrayList<>(); arrayList.add(1);
arrayList.add(2);
arrayList.add(3);
arrayList.add(4);
arrayList.add(5);
arrayList.add(6); 
arrayList.add(7);

// Shuffle the ArrayList
Collections.shuffle(arrayList);
System.out.println("Shuffled Array:"); 
for (Integer value : arrayList) {
System.out.print(value + " ");
}


    
    }
    
}
