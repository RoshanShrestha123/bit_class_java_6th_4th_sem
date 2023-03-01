// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.

public class Triangle {
    public int side1;
    public int side2;
    public int side3;

    Triangle(int a, int b, int c){
        side1 = a;
        side2 = b;
        side3 = c;
    }

    public void getPerimeter(){
        System.out.println(side1 + side2 + side3);
    }

    public void getArea(){
        int s = (side1 + side2 + side3) / 2;
        System.out.println(s * (s - side1) * (s - side2) * (s - side3));
    }
}