
abstract class Shape
{
    abstract void numberOfSides();
}
class Rectangle extends Shape 
{
    int side;
    Rectangle(int side) 
    {
        this.side = side;
    }
    void numberOfSides() 
    {
        System.out.println("Rectangle-Number of Sides = " + side);
    }
}
class Triangle extends Shape 
{
    int side;
    Triangle(int side) 
    {
        this.side = side;
    }
    void numberOfSides() 
    {
        System.out.println("Triangle-Number of Sides = " + side);
    }
}
class Hexagon extends Shape 
{
    int side;
    Hexagon(int side) 
    {
        this.side = side;
    }
    void numberOfSides() 
    {
        System.out.println("Hexagon-Number of Sides = " + side);
    }
}
public class Abstract 
{
    public static void main(String args[]) 
    {
        Rectangle rec = new Rectangle(4);
        Triangle tri = new Triangle(3);
        Hexagon hex = new Hexagon(6);
        rec.numberOfSides();
        tri.numberOfSides();
        hex.numberOfSides();
    }
}