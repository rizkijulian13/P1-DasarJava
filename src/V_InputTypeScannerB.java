
import java.io.IOException;
import java.util.Scanner;

public class V_InputTypeScannerB {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nama anda : ");
        String name = input.nextLine();
        System.out.print("Masukkan umur : ");
        int age = input.nextInt();
        System.out.print("Masukkan tinggi badan : ");
        double height =input.nextDouble();
        System.out.print("Sudah menikah (true/false) : ");
        boolean married = input.nextBoolean();
        System.out.print("nama : " + name);
    }
}
