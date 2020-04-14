import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class PersonalityTester
{
    @Test
    public void helloTest(){
        try {
            Scanner solution = new Scanner(new File("big_correct_output.txt"));
            File in = new File("big_input.txt");
            File out = new File("big_output.txt");
            PersonalityTest.run(in, out);
            Scanner answer = new Scanner(out);
            while(solution.hasNextLine()) {
                String s = solution.nextLine();
                String a;
                if (answer.hasNextLine()) {
                    a = answer.nextLine().trim();
                } else {
                    break;
                }
                while (a.isEmpty() && answer.hasNextLine()) {
                    a = answer.nextLine().trim();
                }
                assertEquals(s, a);
            }
            while(answer.hasNextLine()) {
                assertTrue(answer.nextLine().trim().isEmpty());
            }
            assertFalse(solution.hasNextLine());
        } catch (IOException err) {
            throw new AssertionError("Cannot open input files, or your program threw an IOException error.", err);
        }
    }
}
