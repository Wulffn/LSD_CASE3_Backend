import booking.entity.Address;
import booking.entity.Person;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AddressTest {

    @Test
    public void mustBeAbleToCreateAddress() {
        //Arrange, Act
        String streetAddres = "testvej";
        int zipCode = 1234;
        String city = "testCity";
        Address address = new Address(streetAddres,zipCode, city);
        //Assert
        assertNotNull(address);
    }
}
