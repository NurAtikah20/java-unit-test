// Mengimpor metode 'assertEquals' dari pustaka JUnit.
import static org.junit.Assert.assertEquals;
import org.junit.Test;  // Mengimpor anotasi 'Test' dari pustaka JUnit.

public class SimpleCalculatorTest {
    private SimpleCalculator simpleCalculator = new SimpleCalculator();  // Membuat instance dari SimpleCalculator.

    @Test
    public void twoPlusTwoShouldEqualFour() {  // Deklarasi metode pengujian.
        int result = simpleCalculator.add(20, 5);  // Memanggil metode 'add' dan menyimpan hasilnya dalam variabel 'result'.
        assertEquals(25, result);  // Memeriksa apakah 'result' sama dengan 25
    }
}
