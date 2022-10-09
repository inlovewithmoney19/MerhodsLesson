import java.util.Scanner;

public class MathOperations11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        char mathSymbol = scanner.nextLine().charAt(0);
        double secondNum = Double.parseDouble(scanner.nextLine());

        if (mathSymbol == 43){ // плюс
            System.out.printf("%.0f",addResult(firstNum,secondNum));
        }else if (mathSymbol == 45){ // минус
            System.out.printf("%.0f",subtractResult(firstNum,secondNum));
        }else if (mathSymbol == 42){ // умножение
            System.out.printf("%.0f",multiplyResult(firstNum,secondNum));
        }else if (mathSymbol == 47) { // деление
            System.out.printf("%.0f",divideResult(firstNum,secondNum));
        }
    }
    public static double addResult (double firstNum, double secondNum){
        return firstNum + secondNum;
    }

    public static double subtractResult (double firstNum, double secondNum){
        return firstNum - secondNum;
    }

    public static double  divideResult (double firstNum, double secondNum){
        return firstNum / secondNum;
    }

    public static double multiplyResult (double firstNum, double secondNum){
        return firstNum * secondNum;
    }
}
