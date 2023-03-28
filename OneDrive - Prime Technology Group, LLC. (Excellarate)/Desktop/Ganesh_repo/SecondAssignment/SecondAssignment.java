package EasyLevelAssignment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
public class SecondAssignment {
    private static final String Newdesignation = null;
    public static void main(String[] args) {
        LinkedList<String> ListOne = new LinkedList();
        ListOne.add("London");
        ListOne.add("New york");

        LinkedList<String> ListTwo = new LinkedList();
        ListTwo.add("New york");
        ListTwo.add("Lima");

        LinkedList<String> ListThree = new LinkedList();
        ListThree.add("Lima");
        ListThree.add("Sao paulo");

        ArrayList<LinkedList> AllList = new ArrayList<LinkedList>();
        AllList.add(ListOne);
        AllList.add(ListTwo);
        AllList.add(ListThree);

        System.out.println(AllList);
        String Designation = findDesignation(AllList);
        System.out.println(Designation);
    }
    private static String findDesignation(ArrayList<LinkedList> AllList) {
        HashSet<String> StartCities = new HashSet<>();
        HashSet<String> EndCities = new HashSet<>();
        for (LinkedList<String> path : AllList) {
            StartCities.add(path.get(0));
            EndCities.add(path.get(1));
        }
        for (String EndCity : EndCities) {
            if (!StartCities.contains(EndCity)) {
                return EndCity;
            }
        }
        return null;
    }
}
