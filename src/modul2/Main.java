package modul2;

import java.util.Scanner;

public class Main {
    public void main(){
        punktzahl();
    }
    public void geldbetrafg(){
        Scanner scanner = new Scanner(System.in);
        int betrag = scanner.nextInt(); // eingabeGeldbetrag
        System.out.println(betrag);
        int hunderter= 0;
        int fünfziger = 0;
        int zwanziger = 0;
        int zehner = 0;
        int fünfer = 0;
        int münzen = 0;

        hunderter = betrag/100;
        betrag = betrag - hunderter*100; //rest nehmen und damit weiterrechnen
        System.out.println(betrag);
        fünfziger = betrag/50;
        betrag = betrag - fünfziger*50;
        System.out.println(betrag);
        zwanziger = betrag/20;
        betrag = betrag - zwanziger * 20;
        System.out.println(betrag);
        zehner = betrag/10;
        betrag = betrag - zehner* 10;
        System.out.println(betrag);
        fünfer = betrag/5;
        if(fünfer != 0){
            betrag = betrag - fünfer*5;
        }

        münzen = betrag;


        String ergebnis = "100er:" + hunderter + " 50er:"+fünfziger+ " 20er:" +zwanziger + " 10er:" + zehner+ " 5er:" +fünfer + " Münzen:"+ münzen;
        System.out.println(ergebnis);
    }
    public void punktzahl(){
        Scanner scanner = new Scanner(System.in);
        int würfel1 = scanner.nextInt();
        int würfel2 = scanner.nextInt();
        int punkte = 0;
        if(würfel1> würfel2){//guckt ob würfel 1 größer als 2 ist,
            punkte = würfel1*10 +würfel2; //
        }else if(würfel1 == würfel2) {
            punkte = würfel1*50;
        }else if (würfel1 == 1 || würfel2 == 1 || würfel1 == 2|| würfel2 == 2){
            punkte = 350;
        }
        else
        punkte = würfel2*10 +würfel1;
        System.out.println(punkte);
        }


}
