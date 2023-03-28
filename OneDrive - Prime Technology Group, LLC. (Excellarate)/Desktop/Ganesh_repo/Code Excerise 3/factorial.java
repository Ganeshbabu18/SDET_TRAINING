package EasyLevelAssignment;
public class FactorialNum {
    public static int factorial(int Number){
        if (Number == 0)
            return 1;
        return Number*factorial(Number-1);
    }
    public static void main(String[] args){
        int Fnum = 10;
        System.out.println("Factorial of "+ Fnum + " is " + factorial(Fnum));
    }
}
