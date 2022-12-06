import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerSuccessTest {


    private Passenger myPassenger;

    @BeforeEach
    void setUp() {
        myPassenger = new Passenger ("Mr", "Lorcan Stakem", 1234567891, 12345678, 29 );
    }

    @Test
    void testTitlePass(){
        assertEquals("Mr", myPassenger.getTitle());
        myPassenger.setTitle("Ms");
        assertEquals("Ms", myPassenger.getTitle());
        myPassenger.setTitle("Mrs");
        assertEquals("Mrs", myPassenger.getTitle());
    }

    @Test
    void testNamePass() {
        assertEquals("Lorcan Stakem", myPassenger.getName());
    }

    @Test
    void testIdPass(){
        assertEquals(1234567891, myPassenger.getId());
    }

    @Test
    void testPhonePass () {
        assertEquals(12345678, myPassenger.getPhone());
    }

@Test
    void testAgePass() {
        assertEquals(29, myPassenger.getAge());
    }
    @AfterEach
    void tearDown() {
    }

}