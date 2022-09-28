import java.util.Scanner;
public class rectangle {
    int side1;
    int side2;
    int area;
    int perimeter;
    
    public int setFirstSide() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a side length: ");
        int n = num.nextInt();
        num.close();
        System.out.println("The value of one side of this square is "+n);
        return this.side1 = n;
    }
    public int setSecondSide() {
            Scanner num2 = new Scanner(System.in);
            System.out.println("Enter a side length: ");
            int n2 = num2.nextInt();
            num2.close();
            System.out.println("The value of one side of this square is "+n2);
            return this.side2 = n2;
    }
    public int findArea() {
        int area = side1 * side2;
        System.out.println("The area of this square is "+area);
        return this.area = area;
    }
    public int findPerimeter() {
        int perimeter = (side1 * 2)+(side2 * 2);
        System.out.println("The perimeter of this square is "+perimeter);
        return this.perimeter = perimeter;
    }
    public static void main(String[] args) {
        rectangle rectangle2 = new rectangle();
        rectangle2.setFirstSide();
        rectangle2.setSecondSide();
        rectangle2.findArea();
        rectangle2.findPerimeter();
    }
}
