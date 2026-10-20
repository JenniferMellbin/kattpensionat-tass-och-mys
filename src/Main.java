// 1. [x] Skapa en katt med namn, ras och chipnummer
// 2. [x] Skapa ett katthotell med en privat lista över incheckade katter.
// 3. [x] Skapa en incheckning som stoppar katter med samma chipnummer.
// 4. [] Skapa ett upprop som visar alla katters namn, ras och chipnummer.
// 5. [] Visa ett tydligt meddelande om katthotellet är tomt.

public class Main {
    public static void main(String[] args) {

        KattHotell hotell = new KattHotell();

        Katt katt1 = new Katt("Misse", "Bondkatt", 12345);
        hotell.checkaIn(katt1);

        Katt katt2 = new Katt("Luna", "Ragdoll", 67890);
        hotell.checkaIn(katt2);

        Katt katt3 = new Katt("Simba", "Perser", 12345);
        hotell.checkaIn(katt3);

        System.out.println("Antal incheckade katter: " + hotell.antalKatter());
    }
}