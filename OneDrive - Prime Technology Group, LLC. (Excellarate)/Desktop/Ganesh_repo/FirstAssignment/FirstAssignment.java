package MidLevelAssignment;
public class FirstAssignment {
        public static void main(String[] args) {
            String Occurance ="abacbc";
            char SearchOne= 'a';
            char SearchTwo= 'b';
            char SearchThree= 'c';
            int CountOne = 0;
            int CountTwo = 0;
            int CountThree = 0;
            for (int Number=0; Number<Occurance.length();Number++) {
                if (SearchOne==Occurance.charAt(Number))
                    CountOne++;
                else if(SearchTwo==Occurance.charAt(Number))
                    CountTwo++;
                else if(SearchThree==Occurance.charAt(Number))
                    CountThree++;
            }
            if ((CountOne==CountTwo)&&(CountTwo==CountThree))
            {
                System.out.println("All Characters Have equal number of Occurrences");
            }
            else {
                System.out.println("All Characters Have different number of Occurrences");
            }
        }
    }
