import java.util.Scanner;

public class GreaterOfTwoValues09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());

                getMax(firstNum,secondNum);
                break;

                case "char":
                    char firstSymbol = scanner.nextLine().charAt(0);
                    char secondSymbol = scanner.nextLine().charAt(0);

                    getMax(firstSymbol,secondSymbol);
                    break;

            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();

                getMax(firstText,secondText);
                break;
        }
    }

    public static  void getMax (int firstNum, int secondNum){
        if(firstNum > secondNum){
            System.out.println(firstNum);
        }else {
            System.out.println(secondNum);
        }
    }

    public static void  getMax (char firstSymbol, char secondSymbol){
        if (firstSymbol > secondSymbol){
            System.out.println(firstSymbol);
        }else {
            System.out.println(secondSymbol);
        }
    }

    public static void  getMax (String firstTex,String secondTex){
        if (firstTex.compareTo(secondTex) > 0){
            System.out.println(firstTex);
        }else {
            System.out.println(secondTex);
        }
    }
}
