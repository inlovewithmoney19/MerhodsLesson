import java.util.Scanner;

public class PrintingTriangle03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt(scanner.nextLine());

        printTriangleTop(numInput);
    }
    public static void printTriangleTop (int rotation){

        for (int i = 1; i <= rotation ; i++) {
            printLine(1,i);
        }
        for (int i = rotation -1 ; i >=1 ; i--) {
            printLine(1,i);
        }
    }
    public static  void printLine (int start, int end){
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
