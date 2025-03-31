import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean hajaj = true;

        ArrayList<Kniha> knihy = new ArrayList<Kniha>();
        while(hajaj){
            System.out.println("(zadat - zadá knihu, konec - zastavení programu, zmenit - změní název knihy)");
            switch(sc.nextLine()){
                case "zadat":
                    System.out.println("Enter the name of your knihy: ");
                    String nazev = sc.nextLine();
                    System.out.println("Enter the rokVydani of your knihy: ");
                    int rokVydani = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the autor of your knihy: ");
                    String autor = sc.nextLine();

                    knihy.add(new Kniha(nazev,rokVydani,autor));
                    System.out.println(knihy.toString());
                    break;
                case "konec":
                    System.err.println("Absolutní selhání systému");
                    System.err.println("Váš počítač nyní vybouchne lokální dětskou nemocnici");
                    hajaj = false;
                    System.out.println(knihy.toString());
                    break;
                case "zmenit":
                    System.out.println("U jaké knihy chcete změnit název?");
                    int x = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name of your knihy: ");
                    nazev = sc.nextLine();

                    knihy.get((x-1)).setNazev(nazev);
                    System.out.println(knihy.toString());

                    break;
            }


        }
    }
}