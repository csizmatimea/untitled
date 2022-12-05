import java.util.Arrays;
import java.util.List;

public class Task75 {

    public static void main(String[] args) {

        List<String> testruns = Arrays.asList("00171", "0018X" , "45671");
        String testrun = testruns.get(0); //testrun = 00171
        int testsize = 0;
        System.out.println(testsize = testruns.size());

        int pass = 0;
        int skip=0;
        int failed=0;

        for (String elements : testruns) {
            String elementrun = String.valueOf(elements.charAt(4));
            if (elementrun.equals("1")) {
                pass = pass +1;
            } else if (elementrun.equals("X")) {
                skip = skip+1;
            } else if (elementrun.equals("0")) {
                failed = failed+1;
            }
        }
        double passPercent = (double) pass/testruns.size() * 100;
        double skipPercent= (double) skip/testruns.size()*100;
        double failedPercent = (double) failed/testruns.size()*100;

        System.out.println("pass: " + pass + "skip: " + skip + "failed: " + failed);
        System.out.println("Pass%: " + passPercent +" "+ "Skip%: " + skipPercent +" "+ "Failed%: " + failedPercent);

    }
}
