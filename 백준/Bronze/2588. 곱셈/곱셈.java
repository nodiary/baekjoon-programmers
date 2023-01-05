import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b1, b2, b3;
        String b = "";
        a = Integer.parseInt(br.readLine());
        b = br.readLine();
        b1 = Integer.parseInt(b.substring(0,1));
        b2 = Integer.parseInt(b.substring(1,2));
        b3 = Integer.parseInt(b.substring(2,3));
        System.out.println(a*b3);
        System.out.println(a*b2);
        System.out.println(a*b1);
        System.out.println(a*Integer.parseInt(b));
    }
}