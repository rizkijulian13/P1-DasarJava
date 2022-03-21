import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class S_BufferedReader {
    public static void main(String[] args)throws IOException {
        InputStreamReader key = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);
        System.out.println("What Is your name");
        System.out.println("My name is"+ input);


    }
}
