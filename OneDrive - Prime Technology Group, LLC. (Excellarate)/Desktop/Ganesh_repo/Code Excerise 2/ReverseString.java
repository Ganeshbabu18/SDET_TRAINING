package EasyLevelAssignment;
import java.io.*;
import java.util.Scanner;
public class ReverseString {

        public static void main (String[] args) {

            String str= "Ganesh", nstr="";
            char word;
            System.out.println("Original word is Ganesh");

            for (int i=0; i<str.length(); i++)
            {
                word = str.charAt(i);
                nstr= word + nstr;
            }
            System.out.println("Reversed word is "+ nstr);
        }
    }
