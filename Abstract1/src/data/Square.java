package data;

public class Square extends Rectangle{

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    
    @Override
    public void paint() {
        System.out.printf("|Square   |%-10s|%-10s|%-10s|%4.1f|%7.2f|\n", owner, color, borderColor, a, getArea());
    }
    
    public void sayHI() {
        System.out.println("HELLLLOOOOOOOOOOO");
    }
    
}
