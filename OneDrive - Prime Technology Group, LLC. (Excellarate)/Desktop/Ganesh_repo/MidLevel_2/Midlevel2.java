package MidLevelAssignment;
import java.util.Scanner;
public class MidlevelTwo {
    public static void main(String args[]) {
        int One, Two, Three, Four;
        Scanner sc = new Scanner(System.in);
        System.out.println("The pattern is ");
        Four = 4;
        for (One = 1; One <= 4; One ++) {
            for (Two = Four; Two > 1; Two--) {
                System.out.print(" ");
            }
            for (Three = One; Three != 0; Three--) {
                System.out.print(Three);
            }
            Four--;
            for (int Assemble = 2; Assemble <= One; Assemble++) {
                System.out.print(Assemble);
            }
            System.out.println();
        }
    }
}
