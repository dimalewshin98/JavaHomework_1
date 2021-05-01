package homework;

public class Multiplication {

    public static void main(String[] args) {
        String out = "";
        int num;

        for (int i = 1; i <= 10; i++){
            for (int n = 1; n <= 10; n++){
                num = i*n;
                if (num < 10) {
                    out += num + "  ";
                    }
                else{
                    out += num + " ";
                    }
                }
            out += "\n";
            }
        System.out.println(out);
        }
    }
