import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in); 
        ArrayList<Integer> foo = new ArrayList<>(); 
        int N = Integer.parseInt(s.next()); 
        while(s.hasNext()) {
            foo.add(Integer.parseInt(s.next()));
        }

        System.out.println("hi");

        boolean composite; 
        // Iterate through the given list 
        for(int i = 0; i < N; i++) {
            composite = false; 
            // Check if the value at the current index is composite 
            for(int j = 2; j < foo.get(i); j++) {
                if(foo.get(i) % j == 0) {
                    composite = true; 
                    break; // We know the number at the given index is composite so we don't need to keep checking
                }
            }
            if(i == N - 1) { // If this is the last int, then we don't want to print a space after it
                if(composite) { 
                    System.out.print("Composite");
                }
                else { 
                    System.out.print("Prime");
                }
            }
            else { 
                if(composite) { 
                    System.out.print("Composite" );
                }
                else { 
                    System.out.print("Prime ");
                }
            }
        }
    }
}