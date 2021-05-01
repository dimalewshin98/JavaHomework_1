package homework;
import java.util.ArrayList;
import java.util.Scanner;

public class EchoChamber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> outlist = new ArrayList<>();

        for (int i = 0; i < 1;) {
            String input = scanner.nextLine();

            if (input.equals("")){
                for (int n = 0; n < outlist.size() ; n++)
                    System.out.println(outlist.get(n));
                i++;
            }
            else{
                outlist.add(input);
            }
        }
    }
}
