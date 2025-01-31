import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#");
        double peso;

        System.out.println("""
                Qual a conversão que deseja realizar?
                1 - KG para LBS.
                2 - LBS para KG.
                """);

        switch (leitor.nextInt()) {
            case 1:
                System.out.println("Qual peso deseja converter: ");
                peso = leitor.nextDouble();
                System.out.println("De " + peso + "KG para " + f.format(kgLbs(peso)) + "LBS.");
                break;
            case 2:
                System.out.println("Qual peso deseja converter: ");
                peso = leitor.nextDouble();
                System.out.println("De " + peso + "LBS para " + f.format(LbsKg(peso)) + "KG.");
                break;
        }
    }

    public static double kgLbs(double k) {
        return k * 2.204623;
    }

    public static double LbsKg(double l) {
        return l * 0.4536;
    }
}