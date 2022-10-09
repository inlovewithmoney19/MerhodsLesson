import java.util.Scanner;

public class MultiplyEvensByOdds10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        printResultOddMultiplyEven(number);
    }
    public static void printResultOddMultiplyEven (String text){
        int currentNumber = Integer.parseInt(text);
        int oddNum = 0;
        int evenNum = 0;
        for (int i = 0; i < text.length() ; i++) {
            int Number = currentNumber % 10;

            if (Number % 2 == 0 ){
                oddNum += Number;
            }else {
                evenNum += Number;
            }

            currentNumber = currentNumber / 10;
        }
        int result = evenNum * oddNum;

        System.out.println(result);
    }
}
