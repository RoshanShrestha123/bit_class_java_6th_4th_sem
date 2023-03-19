package Interface;

public class Rectangle implements AnotherShape{

    @Override
    public void getArea() {
        System.out.println("" +
                "Rectangle ko area");
    }

    @Override
    public void getColor() {
        System.out.println("Red");
    }
}
