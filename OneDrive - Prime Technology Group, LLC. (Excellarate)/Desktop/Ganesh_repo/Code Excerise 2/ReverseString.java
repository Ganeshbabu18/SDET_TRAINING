package EasyLevelAssignment;
import java.io.*;
import java.util.Scanner;
public class ReverseString {
    public static void main (String[] args) {
        String str= "Ganesh Babu", nstr="";
        char word;
        System.out.println("Original word is Ganesh Babu");
        for (int Reverse=0; Reverse<str.length(); Reverse++)
        {
            word = str.charAt(Reverse);
            nstr= word + nstr;
        }
        System.out.println("Reversed word is "+ nstr);
    }
}
