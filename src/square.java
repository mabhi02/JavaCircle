import java.util.Scanner;
public class square {
    int side;
    int area;
    int perimeter;
    
    public int setSide() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a side length: ");
        int n = num.nextInt();
        num.close();
        System.out.println("The value of one side of this square is "+n);
        return this.side = n;
    }
    public int findArea() {
        int area = side * side;
        System.out.println("The area of this square is "+area);
        return this.area = area;
    }
    public int findPerimeter() {
        int perimeter = side * 4;
        System.out.println("The perimeter of this square is "+perimeter);
        return this.perimeter = perimeter;
    }
    public static void main(String[] args) {
        square square2 = new square();
        square2.setSide();
        square2.findArea();
        square2.findPerimeter();
    }
}
