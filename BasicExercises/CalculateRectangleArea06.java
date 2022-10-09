import java.util.Scanner;

public class CalculateRectangleArea06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double areaResult = rectangleArea(width,height);
        System.out.printf("%.0f",areaResult);
    }
    public static double rectangleArea (double width,double height){
        double area = width * height;
        return area;
    }
}
