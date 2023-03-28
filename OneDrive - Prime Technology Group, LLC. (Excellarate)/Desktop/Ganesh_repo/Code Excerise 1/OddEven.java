package EasyLevelAssignment;
public class OddEven {
        public void Even_Odd_Number(int number) {
            //  int num = 11;
            if (number % 2 == 0) {
                System.out.println("The given Number is even");
            } else {
                System.out.println("The given Number is odd");
            }
        }
        public static void main(String[] args) {
            OddEven EvenOdd = new OddEven();
            EvenOdd.Even_Odd_Number(11);
        }
    }