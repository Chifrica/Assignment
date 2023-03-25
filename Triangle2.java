import java.util.Scanner;

class TriangleClass {

    //Instances variable
    private double sideA;
    private double sideB;
    private double sideC;
    
    //Getter for A
    public double getSideA(){
        return sideA;
    }

    //Setter for B
    public double getSideB(){
        return sideB;
    }

    //Getter for C
    public double getSideC(){
        return sideC;
    }

    //Setter for A
    public void setSideA(double sideA){
        if(sideA < 0) sideA = 0;
        this.sideA = sideA;
    }

    //Setter for B
    public void setSideB(double sideB){
        if(sideB < 0) sideB = 0;
        this.sideB = sideB;
    }

    //Setter for C
    public void setSideC(double sideC){
        if(sideC < 0) sideC = 0;
        this.sideC = sideC;
    }

    //Contructor with no-arguments
    public TriangleClass(){
        this(1.0, 1.0, 1.0);
    }

    //Contrustor with three arguments
    public TriangleClass(double sideA, double sideB, double sideC){
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    //Area of a triangle a = (a+b+c) / 2
    //Math.sqrt(x * (x - a) * (x - b) (x - c))
    public double calculateArea(){
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s- sideC));
    }

    // Angle A of a triangle x = (b*b + c*c - a*a) / 2 * (b*b)
    //Cos(x)
    public double calculateAngleA(){
        double cosA = (Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC);
        return Math.acos(cosA);
    }

    //Perimeter of a triangle x = (a+b+c) / 2
    public double calculatePerimeter(){
        double s = (sideA + sideB + sideC) / 2.0;
        return s;
    }
}

public class Triangle2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the value of side a");
        double a = input.nextDouble();
        System.out.println("Input the value of side b");
        double b = input.nextDouble();
        System.out.println("Input the value of side c");
        double c = input.nextDouble();

        TriangleClass triangle = new TriangleClass(a, b, c);
        System.out.printf("The perimeter of a triangle is = %.2f \nThe area of a triangle is = %.2f", 
                            triangle.calculatePerimeter(), triangle.calculateArea()
        );
    }
}