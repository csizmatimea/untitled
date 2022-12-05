import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        List<String> travel = new ArrayList<>();
        String travellist = String.valueOf(0);
        boolean no = true;

        do {
            System.out.println("Give me yout travel list. If you are finished pleas, press 'x'");
            travellist = scanner.nextLine();

            if (travellist.equals("x")) {
                no = false;
            } else if (travel.contains(travellist)) {
                // System.out.println("This data is already included. Please give me an other.");
                System.out.println("removed from the list ");
                travel.remove(travellist);
            } else {
                travel.add(travellist);
            }

            // if(travel.size()==0);
            if(travel.isEmpty());
            System.out.println("you done");
            //break;
            no= false;

        } while (no) ;

        for (int i = 0; i < travel.size(); i++) {
            System.out.println(" your list" + travel.get(i));
        }
    }
}
