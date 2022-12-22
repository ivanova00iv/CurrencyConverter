import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double exchangeRate = 0;
        double result = 0;
        String chooseCurrency = "Start";
        System.out.println("Input currency in bulgarian lev: ");
        double bulgarianLev = Double.parseDouble(scan.nextLine());
        while (chooseCurrency != "Exit")
        {
            System.out.println("--------MENU--------");
            System.out.println("1. Euro\n2. Dollar\n3. Lira");


            System.out.println("Choose conversion currency: ");
            chooseCurrency = scan.nextLine();

            switch (chooseCurrency)
            {
                case "Euro":
                    exchangeRate = 0.51;
                    break;
                case "Dollar":
                    exchangeRate = 0.49;
                    break;
                case "Lira":
                    exchangeRate = 9.16;
                    break;
                default:
                    System.out.println("You have typed unknown currency!");
            }
            result = bulgarianLev * exchangeRate;
            System.out.printf("Your final currency: %.2f%n",result);
        }

    }

}