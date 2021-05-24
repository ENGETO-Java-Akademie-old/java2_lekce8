import java.util.Scanner;

public class UzivatelskeRozhrani {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Start");

        String vstup = "";

        while (!"Konec".equals(vstup)) {

            System.out.println("Moznosti: 'A': Operace A; 'Ulozit': Ulozeni do souboru; 'Konec': Konec");

            vstup = in.nextLine();

            switch (vstup) {
                case "A":
                    opearaceA();
                    break;
                case "Ulozit":
                    System.out.print("Jmeno souboru:");
                    String jmenoSouboru = in.nextLine();
                    ulozeniDoSouboru(jmenoSouboru);
                    break;

                default:
                    System.out.println(">>>>" + vstup);
            }
        }
    }

    private static void opearaceA() {
        System.out.println("Provadim operaci A");
    }

    private static void ulozeniDoSouboru(String jmenoSouboru) {
        System.out.println("Provadim ulozeni do souboru: " + jmenoSouboru);
    }
}
