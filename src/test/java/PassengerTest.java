import ie.gmit.Passenger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest{

    private Passenger pass;
    @Test
    public void testTitle(){

        pass = new Passenger("Mr" , "Mark", "6138294173", 1943678145l,24);
        assertEquals( "Mr", pass.getTitle());

    }
    void testConstructorInvalidTitle(){
        final String invalid = "Invalid title entered";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Miss", "Mary","5172839645", 1945882691l,35));
        assertEquals(invalid,exception.getMessage());
    }

}