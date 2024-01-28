import java.util.Scanner;



public class Pisin {
    public static void main(String[] args) {
    if (args.length == 0){
        System.out.println("Ei parametreja");
    }
    if (args.length >= 1){
        String pisin = "";
        for (int i =0; i < args.length; i++) {
            if (args[i].length() > pisin.length()) {
                pisin = args[i];
            }
        }
        System.out.println("Pisin parametri: " + pisin);
    }



        }
}

