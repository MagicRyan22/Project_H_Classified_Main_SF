package Classification20_Projects;
        /*1. Write program: Shape class has a constructor that takes the
        radius and has a subclass as  circle class. In circle class create
        a method to calculate the area of circle. Test your code
        */


public class Homework_ShapeClass {

    int radius;
    double pi = 3.1415926536;

    double length_a;

    double length_b;
    double length_c;


    Homework_ShapeClass(int radius){
        this.radius=radius;
    }
    Homework_ShapeClass(double length_a){
        this.length_a=length_a;
    }
    Homework_ShapeClass(double length_a,double length_b){
       this.length_a=length_a;
       this.length_b=length_b;
    }
    Homework_ShapeClass(double length_a,double length_b,double length_c){
        this.length_a=length_a;
        this.length_b=length_b;
        this.length_c=length_c;
    }

}

class Circle extends Homework_ShapeClass{

    double diameter =2*(radius);
    Circle(int radius) {
        super(radius);
    }

    void circleArea(){
        System.out.println("The area of a  circle with a radius of "+radius+" equals to "+String.format("%.3f",(pi*radius*radius))+"!");
    }
    void circleCircumference(){
        System.out.println("The circumference of a circle with a radius of "+radius+" equals to "+String.format("%.1f",(pi*diameter))+"!");
    }
}
class Square extends Homework_ShapeClass{


    Square(double length_a) {
        super(length_a);
    }

    void squareArea(){
        System.out.println("The area of a square with a length of one side of "+length_a+" equals to "+String.format("%.2f",(length_a*length_a))+"!");
    }
    void squarePerimeter(){
        System.out.println("The perimeter a square with a length of one side of "+length_a+" equals to "+String.format("%.2f",(length_a*4))+"!");
    }

}

class Rectangle extends Homework_ShapeClass {

    Rectangle(double length_a, double length_b) {
        super(length_a, length_b);
    }
    void rectangleArea(){
        System.out.println("The area of a rectangle with a length of side one "+length_a+" and a length af side two "+length_b+" equals to "+String.format("%.2f",(length_a*length_b))+"!");
    }
    void rectanglePerimeter(){
        System.out.println("The perimeter a rectangle with a length of side one "+length_a+" and a length af side two "+length_b+" equals to "+String.format("%.2f",((2*length_a)+(2*length_b)))+"!");
    }
}

class Cube_Cuboid extends Homework_ShapeClass{

    Cube_Cuboid(double length_a, double length_b, double length_c) {
        super(length_a, length_b, length_c);
    }

    void cubeVolume(){
        System.out.println("The Volume of a cube with a side length of "+length_a+" equals to "+String.format("%.2f",(length_a*length_a*length_a))+"!");
    }
    void cubeSurfaceArea(){
        System.out.println("The SurfaceArea of a cube with a side length of "+length_a+" equals to "+String.format("%.2f",(6*(length_a*length_a)))+"!");
    }
    void cubeFaceDiagonal(){
        System.out.println("The Face Diagonal of a cube with a side length of "+length_a+" equals to "+String.format("%.2f",(Math.sqrt(2)*length_a))+"!");
    }
    void cubeSolidDiagonal(){
        System.out.println("The Solid Diagonal of a cube with a side length of "+length_a+" equals to "+String.format("%.2f",(Math.sqrt(3)*length_a))+"!");
    }
    void cubeLateralSurfaceArea(){
        System.out.println("The Lateral Surface Area of a cube with a side length of "+length_a+" equals to "+String.format("%.2f",(4*(length_a*length_a)))+"!");
    }
    void cubeSideSurfaceArea(){
        System.out.println("The Surface Area of one side of a cube with a side length of "+length_a+" equals to "+String.format("%.2f",(length_a*length_a))+"!");
    }
    void cuboidVolume(){
        System.out.println("The Volume of a cuboid with a side lengths length, width, height of "+length_a+","+length_b+","+length_c+" equals to "+String.format("%.2f",(length_a*length_b*length_c))+"!");
    }
    void cuboidSurfaceArea(){
        System.out.println("The SurfaceArea of a cuboid with a side lengths --length, width, height-- of "+length_a+","+length_b+","+length_c+" equals to "+String.format("%.2f",(2*((length_a*length_b)+(length_a*length_c)+(length_b*length_c))))+"!");
    }
    void cuboidFace_a_Diagonal(){
        System.out.println("The Face Diagonal of face -a- of a cuboid with a side lengths --length, width, height-- of "+length_a+","+length_b+","+length_c+" equals to "+String.format("%.2f",(Math.sqrt((length_a*length_a)+(length_b*length_b))))+"!");
    }
    void cuboidFace_b_Diagonal(){
        System.out.println("The Face Diagonal of face -b- of a cuboid with a side lengths --length, width, height-- of "+length_a+","+length_b+","+length_c+" equals to "+String.format("%.2f",(Math.sqrt((length_c*length_c)+(length_b*length_b))))+"!");
    }
    void cuboidSolidDiagonal(){
        System.out.println("The Solid Diagonal of a cuboid with a side lengths --length, width, height-- of "+length_a+","+length_b+","+length_c+" equals to "+String.format("%.2f",(Math.sqrt((length_a*length_a)+(length_b*length_b)+(length_c*length_c))))+"!");
    }
    void cuboidLateralSurfaceArea(){
        System.out.println("The Lateral Surface Area of a cuboid with a side lengths --length, width, height-- of "+length_a+","+length_b+","+length_c+" equals to "+String.format("%.2f",(2*((length_a*length_c)+(length_b*length_c))))+"!");
    }
    void cuboidSide_a_SurfaceArea(){
        System.out.println("The Surface Area of area -a- of a cuboid with a side lengths --length, width, height-- of "+length_a+","+length_b+","+length_c+" equals to "+String.format("%.2f",(length_a*length_b))+"!");
    }
    void cuboidSide_b_SurfaceArea(){
        System.out.println("The Surface Area of area -b- of a cuboid with a side lengths --length, width, height-- of "+length_a+","+length_b+","+length_c+" equals to "+String.format("%.2f",(length_a*length_c))+"!");
    }
}

class shapeParameters{
    public static void main(String[] args) {

        Circle cir=new Circle(12);
        cir.circleArea();
        cir.circleCircumference();

        System.out.println("******************************************");

        Square sq=new Square(6);
        sq.squareArea();
        sq.squarePerimeter();

        System.out.println("******************************************");

        Rectangle rec=new Rectangle(12,18);
        rec.rectangleArea();
        rec.rectanglePerimeter();

        System.out.println("*******************************************");

        Cube_Cuboid cu=new Cube_Cuboid(6,7,8);
        cu.cubeVolume();
        cu.cubeSideSurfaceArea();
        cu.cubeSurfaceArea();
        cu.cubeLateralSurfaceArea();
        cu.cubeSolidDiagonal();
        cu.cubeFaceDiagonal();

        System.out.println("-----------------------------------");

        cu.cuboidVolume();
        cu.cuboidSurfaceArea();
        cu.cuboidLateralSurfaceArea();
        cu.cuboidSolidDiagonal();
        cu.cuboidFace_a_Diagonal();
        cu.cuboidFace_b_Diagonal();
        cu.cuboidSide_a_SurfaceArea();
        cu.cuboidSide_b_SurfaceArea();

    }
}
