import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (productInput){
            case "coffee" :
                priceCoffee(quantity);
                break;

            case "water" :
                priceWater(quantity);
                break;

            case "coke" :
                priceCoke(quantity);
                break;

            case "snacks":
                priceSnacks(quantity);
                break;
        }
    }

    public static void priceCoffee (int quantity){
        double price = 1.5;
        System.out.printf("%.2f", quantity * price);
    }

    public  static  void  priceWater (int quantity){
        double price = 1;
        System.out.printf("%.2f",quantity * price);
    }

    public static void  priceCoke (int quantity){
        double price = 1.4;
        System.out.printf("%.2f",quantity * price);
    }

    public static void priceSnacks (int quantity){
        double price = 2;
        System.out.printf("%.2f",quantity * price);
    }
}
