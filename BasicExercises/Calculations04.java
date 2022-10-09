import java.util.Scanner;

public class Calculations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":
                sumProduct(firstNumber,secondNumber);
                break;
            case "multiply":
                multiplyProduct(firstNumber,secondNumber);
                break;
            case "subtract":
                subtractProduct(firstNumber,secondNumber);
                break;
            case "divide":
                divideProduct(firstNumber,secondNumber);
                break;
        }
    }
    public  static  void sumProduct (int firstNum,int secondNum) {
        System.out.println(firstNum + secondNum);
    }
    public static  void multiplyProduct(int firstNum, int secondNum){
        System.out.println(firstNum * secondNum);
    }
    public static void subtractProduct (int firstNum, int secondNum){
        System.out.println(firstNum - secondNum);
    }
    public  static void divideProduct (int firstNum, int secondNum){
        System.out.println(firstNum / secondNum);
    }
}
