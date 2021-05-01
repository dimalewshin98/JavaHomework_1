package homework.IOChamber;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;


public class IOChamber {
    public static void main(String[] args) {
        boolean check = true;
        Path myFile = null;

        if (args.length != 1){
            check = false;
        }
        else {
                myFile = Paths.get(args[0]);
                if (!Files.exists(myFile)) {
                    System.out.println("Файл не распознан");
                    check = false;
                }
        }

        if (check) {
            firstCase(myFile);
        }
        else secondCase();
    }

    public static void firstCase(Path myFile){
        try {
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(myFile);
            for (int i = 0; i < lines.size(); i++) {
                if (i%2 == 0){
                    System.out.println(lines.get(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void secondCase(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> outlist = new ArrayList<>();

        for (int i = 0; i < 1;) {
            String input = scanner.nextLine();
            if (input.equals("")){
                for (int n = 0; n < outlist.size() ; n++) {
                    if (n%2 == 0){
                        System.out.println(outlist.get(n));
                    }
                    i++;
                }
            }
            else{
                outlist.add(input);
            }
        }
    }
}
