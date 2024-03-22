package modul2;

public class Circle{
 private double r;

 public Circle(double radius){
  this.setR(radius);
 }

 public static void main(String[] args) {
  Circle circle = new Circle(2.5);
  System.out.println("radius: " + circle.getR());
  System.out.println("area: " + getArea(circle));
 }

 private static double getArea(Circle circle) {
  return 3.14 * circle.getR() * circle.getR();
 }

 public double getR() {
  return r;
 }

 public void setR(double r) {
  this.r = r;
 }
}


  

