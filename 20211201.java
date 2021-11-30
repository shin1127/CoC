import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String[] ss = in.nextLine().split("");
        int count = 0;
        for (String s : ss){
            // count = s.equals("+") ? count++ : count--;
            // System.out.println(count + "\n");
            if(s.equals("+")) count++;
            else count--;
        }
        System.out.println(count);
    }
}

// ++++---- -> 4
// +-+-+- -> 0
