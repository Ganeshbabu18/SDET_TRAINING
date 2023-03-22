package MidLevel_Assignment.Midlevel1;
import java.util.Arrays;
    public class Midlevel3 {
        public static void swapEnds() {
            int[] num = {1, 2, 3, 7};
            int numSize = num.length;
            String b = Arrays.toString(num);
            System.out.println(b);
            int lastNum = num[numSize - 1];
            if (lastNum % 2 != 0) {
                int first = num[0];
                num[0] = num[numSize - 1];
                num[numSize - 1] = first;
                String b1 = Arrays.toString(num);
                System.out.println("The last number of array is a prime number " + lastNum);
                System.out.println(b1);
            } else {
                System.out.println("The last number of array is not prime number " + lastNum);
                System.out.println(b);
            }
        }
        public static void main(String[] args) {
            swapEnds();
        }
    }
