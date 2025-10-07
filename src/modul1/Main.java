package modul1;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("bitte P und Q eingeben");
        Scanner s = new Scanner(System.in);

       double p = s.nextDouble();
       double q = s.nextDouble();
        System.out.println(p + " "+q);

        double ergebnis1;
        double ergebnis2;
        ergebnis1 = -(p/2)+Math.sqrt((p/2)*(p/2)-q);
        ergebnis2 =-(p/2)-Math.sqrt((p/2)*(p/2)-q);
        System.out.println("ergbnis: "+ergebnis1 + " "+ ergebnis2);
    }
}
