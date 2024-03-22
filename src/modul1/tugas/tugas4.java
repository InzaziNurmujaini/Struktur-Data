package modul1.tugas;

public class tugas4 {

  private static final double PI = 3.14;

  public double hitungLuas(double radius) {
 
    if (radius <= 0) {
      throw new IllegalArgumentException("Radius harus bernilai positif");
    }
    return PI * radius * radius;
  }
}