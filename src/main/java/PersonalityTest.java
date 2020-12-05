import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PersonalityTest
{

    @Override
    public String toString()
    {
        return "Testing this class";
    }

    public static void run(File inputFile, File outPutFile) throws IOException {
        Scanner in = new Scanner(inputFile);
        FileWriter out = new FileWriter(outPutFile);
        while(in.hasNextLine()){
            String name = in.nextLine();
            String choices = in.nextLine().toUpperCase();
            char[] result =  new char[4];
            long ac = 0;
            long bc = 0;
            for (int i = 0; i < 10; i++) {
                if (choices.charAt(i) == 'A') {
                    ac++;
                } else if (choices.charAt(i) == 'B') {
                    bc++;
                }
            }
            int pc = (int) Math.round(bc/(double)(ac+bc) * 100);
            if (pc < 50) {
                result[0] = 'E';
            } else if (pc > 50) {
                result[0] = 'I';
            } else {
                result[0] = 'X';
            }

            ac = 0;
            bc = 0;
            for (int i = 10; i < 30; i++) {
                if (choices.charAt(i) == 'A') {
                    ac++;
                } else if (choices.charAt(i) == 'B') {
                    bc++;
                }
            }
            pc = (int) Math.round(bc/(double)(ac+bc) * 100);
            if (pc < 50) {
                result[1] = 'S';
            } else if (pc > 50) {
                result[1] = 'N';
            } else {
                result[1] = 'X';
            }

            ac = 0;
            bc = 0;
            for (int i = 30; i < 50; i++) {
                if (choices.charAt(i) == 'A') {
                    ac++;
                } else if (choices.charAt(i) == 'B') {
                    bc++;
                }
            }
            pc = (int) Math.round(bc/(double)(ac+bc) * 100);
            if (pc < 50) {
                result[2] = 'T';
            } else if (pc > 50) {
                result[2] = 'F';
            } else {
                result[2] = 'X';
            }

            ac = 0;
            bc = 0;
            for (int i = 50; i < 70; i++) {
                if (choices.charAt(i) == 'A') {
                    ac++;
                } else if (choices.charAt(i) == 'B') {
                    bc++;
                }
            }
            pc = (int) Math.round(bc/(double)(ac+bc) * 100);
            if (pc < 50) {
                result[3] = 'J';
            } else if (pc > 50) {
                result[3] = 'P';
            } else {
                result[3] = 'X';
            }

            out.write(name + ' ' + '\n');
            out.write(new String(result) + '\n');
        }
        out.close();
        in.close();
    }
}
