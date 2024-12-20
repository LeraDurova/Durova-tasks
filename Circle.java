public class Circle {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double findPerimeter(){
        return 2*3.14*radius;
    }

    public double findSquare(){
        return 3.14*radius*radius;
    }
}
