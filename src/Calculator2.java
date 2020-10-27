import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите 2 числа от 1 до 10 разделяя их знаком арифметической операции (+,-,/,*) и нажмите ввод:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a, b, c;
        String[] data = reader.readLine().replaceAll("\\s+", "").split("");
        a = data[0];
        b = data[1];
        c = data[2];

        int q = Integer.parseInt(a);
        int w = Integer.parseInt(c);
        if (b.equals("+")) {
            int d;
            System.out.print("Ответ: ");
            System.out.println(d = q + w);
        }else
        if (b.equals("-")) {
            int d;
            System.out.print("Ответ: ");
            System.out.println(d = q - w);
        }else
        if (b.equals("*")) {
            int d;
            System.out.print("Ответ: ");
            System.out.println(d = q * w);
        }else
        if (b.equals("/")) {
            int d;
            System.out.print("Ответ: ");
            System.out.println(d = q / w);
        }
    }
}
