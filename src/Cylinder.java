public class Cylinder extends Circle{
    public double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(this.height<0){
            height=0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*getHeight();
    }
}
