public class Circle {
    public double radius;

    public Circle(double radius) {
        if( this.radius<0){
           radius=0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return (radius*radius*Math.PI);
    }
}
