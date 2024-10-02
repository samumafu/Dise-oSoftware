class Circle {
    private double radius = 1.0;  
    private String color = "red"; 

    // Constructor
    public Circle(double radius, String color) {
        this.radius = radius;  
        this.color = color;    
    }

    
    public double getRadius() {
        return radius;  
    }

    public void setRadius(double radius) {  
        this.radius = radius;  
    }

    public String getColor() {  
        return color;  
    }

    public void setColor(String color) {  
        this.color = color;  
    }

    // Método para calcular el área
    public double getArea() {
        return Math.PI * radius * radius;  
    }

    
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";  
    }
}

// Clase Cylinder que hereda de Circle
public class Cylinder extends Circle {
    private double height = 1.0; 

    // Constructor
    
    public Cylinder(double radius, double height, String color) {  
        super(radius, color);  
        
        this.height = height;  
    }

    
    public double getHeight() {
        return height;  
    }

    
    public void setHeight(double height) {
        this.height = height;  
    }

    
    public double getVolume() {
        return getArea() * height;  
    }

}

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(3.0, 5.0, "blue");

        System.out.println(myCylinder.toString());  
        System.out.println("Volumen: " + myCylinder.getVolume());  
    }
}