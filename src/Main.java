import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        GreyPrinceZote Zote = new GreyPrinceZote();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уровень существа :");
        Zote.allDefinition(in.nextInt());
        System.out.println(Zote.allOut());

    }

}
