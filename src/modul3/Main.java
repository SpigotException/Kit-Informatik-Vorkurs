package modul3;

import java.util.Scanner;

public class Main {
    public void  main(String[] args){
    rateSpiel();

    }

    private void summeBerechnen() {
       int a= 100;
       double ergebnis = 0;

       for (int i =1; i <a; i++){
          ergebnis += (double) 1 / (i * i);
          // System.out.println(i);
          //  ergebnis++;
       }
        System.out.println(ergebnis);
    }
    public void rateSpiel(){
        System.out.println("Bitte Zahl eingeben");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double zufallszahl = (int ) ( Math . random () * 100) + 1;
       // System.out.println(zufallszahl);
      while (i != zufallszahl){
           if(zufallszahl > i){

               System.out.println(">");
               i = scanner.nextInt();
           } else if(zufallszahl< i){
               System.out.println("<");
               i = scanner.nextInt();
           }else if( zufallszahl == i){
               System.out.println("Du hast die Zahl gefunden");
               System.out.println(zufallszahl);
           }

       }
        System.out.println("Du hast die Zahl gefunden");
        System.out.println(zufallszahl);




    }
}
