package modul1.tugas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class tugas4Test {
    @Test
    void testHitungLuas() {
    tugas4 obj = new tugas4();
    double radius = obj.hitungLuas(0);
    Assertions.assertEquals(254.34, radius);
    }
}
