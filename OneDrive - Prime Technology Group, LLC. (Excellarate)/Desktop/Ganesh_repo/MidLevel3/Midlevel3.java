package MidLevelAssignment;
import java.util.Arrays;
    public class MidlevelThree {
        public static void swapEnds() {
            int[] num = {1, 2, 3, 7};
            int numSize = num.length;
            String Swaping = Arrays.toString(num);
            System.out.println(Swaping);
            int lastNum = num[numSize - 1];
            int first = num[0];
            num[0] = num[numSize - 1];
            num[numSize - 1] = first;
            String sObject = Arrays.toString(num);
            System.out.println("The last number of array is a prime number " + lastNum);
            System.out.println(sObject);
        }
        public static void main(String[] args) {
            swapEnds();
        }
    }
