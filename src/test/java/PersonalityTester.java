import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Random;

import static org.junit.Assert.*;

public class PersonalityTester
{
    @Test
    public void helloTest(){
        PersonalityTest p = new PersonalityTest();
        assertEquals("Testing this class", p.toString());
    }
}
