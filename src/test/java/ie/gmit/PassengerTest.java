package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest{

    private Passenger pass;
    @Test
    public void testTitle(){

        pass = new Passenger("Mr" , "Pete", "6138294173", "1943678145",24);
        assertEquals( "Mr", pass.getTitle());
    }
    @Test
    public void testName(){

        pass = new Passenger("Mr" , "Pete", "6138294173", "1943678145",24);
        assertEquals( "Pete", pass.getName());

    }
    @Test
    public void testId(){

        pass = new Passenger("Mr" , "Pete", "6138294173", "1943678145",24);
        assertEquals( "6138294173", pass.getId());

    }
    @Test
    public void testPhone(){

        pass = new Passenger("Mr" , "Pete", "6138294173", "1943678145",24);
        assertEquals( "1943678145", pass.getPhone());

    }

    @Test
    void testConstructorInvalidTitle(){
        final String invalid_title = "Invalid title Entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mmms", "John","51472839645", "1945882691",35));
        assertEquals(invalid_title,exception.getMessage());
    }

    @Test
    void testConstructorInvalidName(){
        final String invalid_name = "Invalid name Entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr", "Jo","517826396450", "1945971381",35));
        assertEquals(invalid_name,exception.getMessage());
    }

    @Test
    void testConstructorInvalidId(){
        final String invalid_id = "Invalid Id number Entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr", "John","51782639", "1945971381",35));
        assertEquals(invalid_id,exception.getMessage());
    }
    @Test
    void testConstructorInvalidPhone(){
        final String invalid_ph = "Invalid Phone number Entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr", "John","517826396450", "19459",35));
        assertEquals(invalid_ph,exception.getMessage());
    }

}
