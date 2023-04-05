package EasyLevelAssignment;

class factorial {
        static int factorial(int n)
        {
            if (n == 0)
                return 1;

            return n*factorial(n-1);
        }
        public static void main(String[] args)
        {
            int num = 10;
            System.out.println("Factorial of "+ num + " is " + factorial(num));
        }
    }