package EasyLevelAssignment;
public class OddEven {
        public void Odd_Even_Number(int number) {
            //  int num = 11;
            if (number % 2 == 0) {
                System.out.println("The given Number is even");
            } else {
                System.out.println("The given Number is odd");
            }
        }
        public static void main(String[] args) {
            OddEven Number = new OddEven();
            Number.Odd_Even_Number(11);
        }
    }
