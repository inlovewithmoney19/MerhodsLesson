import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        double result = powerCalculate(number,power);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static double powerCalculate (double num, double power){

        double product = 1;
        for (int i = 1; i <= power; i++) {
            product = product * num;
        }
        return product ;
    }
}
