public class Rectangle {
    double length, width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double findSquare() {
        return length*width;
    }

    public double findPerimeter() {
        return 2*(length+width);
    }
}
