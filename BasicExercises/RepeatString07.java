import java.util.Scanner;

public class RepeatString07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int repeating = Integer.parseInt(scanner.nextLine());

        String sumWords = repeating(repeating,word);
        System.out.println(sumWords);
    }

    public static String repeating (int rows, String text){
        String sumText = "";
        for (int i = 1; i <= rows ; i++) {
            sumText += text;
        }

        return sumText ;
    }
}
